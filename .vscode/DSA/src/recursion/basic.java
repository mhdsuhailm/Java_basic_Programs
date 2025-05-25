package recursion;

public class basic {
    public static void main(String[] args) {
        int n =5;
        fun1(n);

    }
    static void fun(int N){
        if (N < 1) {
            return;
        }
        fun(N - 1);
        System.out.print(N + " ");
    }
    static void fun1(int n){
        if(n == 0){return;}
        System.out.print(n + " ");
        fun1(n-1);

    }
}
