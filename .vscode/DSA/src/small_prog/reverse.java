package small_prog;

public class reverse {
    public static void main(String[] args) {
        int n = 345664;
        int ans = 0;

        while(n > 0){
            int rem = n % 10;
            n = n / 10;
            ans = ans * 10 + rem;
            
        }
        System.out.println(ans);
    }


    

}
