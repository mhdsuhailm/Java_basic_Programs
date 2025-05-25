package accenture;

public class p4 {
    public static void main(String[] args) {
        int n = 6;
        int[] arr ={10,5,6,3,7,2};
        int s=0;
        int d=0;
        for(int i=0;i<n;i++){
            if (i%2 == 0) {
                 s=s^ arr[i];
            }else{
                 d += arr[i];
            }
            
        }
        System.out.println(d - s);
    }
}
