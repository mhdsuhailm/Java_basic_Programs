package accenture;

public class p3 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int n=5;
        for(int num :arr){
            if (num%2 ==0){
                System.out.println("even");
            }else{
                System.out.println("odd");
            }
        }
    }
}
