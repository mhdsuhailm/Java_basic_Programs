package accenture;

public class acc3 {
    public static void main(String[] args) {
        int n = 5;
        int p = 180;
        int time = 240 - p;
        int count = 0;

        for (int i=1; i<=n;i++){
            int solve = i*5;
                if(solve<time && time>0){
                    count += 1;
                    time -= solve;
                }

        }
        System.out.println(count);

    }
}
