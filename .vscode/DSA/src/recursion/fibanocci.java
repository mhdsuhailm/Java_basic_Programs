package recursion;

public class fibanocci {
    public static void main(String[] args) {
        System.out.println(fibanocci(6));
        System.out.println(fibanocci1(6));

    }
    static int fibanocci(int n){
        if(n<2){
            return n;
        }
        return fibanocci(n-1)+fibanocci(n-2);
    }
    static int fibanocci1(int n){
        int ans =0;
        if(n<2){
            System.out.println(n);
            return n;
        }else{
            // System.out.println(n);
            ans = fibanocci1(n-1)+fibanocci1(n-2);
            System.out.print(n+" ");
            return ans;
        }
    }
}
