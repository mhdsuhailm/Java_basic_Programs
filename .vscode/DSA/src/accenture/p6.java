package accenture;

public class p6 {
    public static void main(String[] args) {
        int n = 10; // Example input
        // for (int i = 0; i < n; i++) {
        //     System.out.print(fibanacci(i) + " ");
        // }
        System.out.println(fibanocci(n));
    }
    
    static int fibanocci(int n) {
        if (n < 2) {
            return n;
        }
        return (fibanocci(n - 1) * fibanocci(n - 1) + fibanocci(n - 2) * fibanocci(n - 2)) % 47;
    }
}

    // static int fibonacci(int n) {
    //     final int MOD = 47;
    //     if (n == 0 || n == 1) {
    //         return 1; // Base cases: f(0) = 1 and f(1) = 1
    //     }

    //     int[] fib = new int[n + 1];
    //     fib[0] = 1;
    //     fib[1] = 1;

    //     for (int i = 2; i <= n; i++) {
    //         fib[i] = ((fib[i - 1] * fib[i - 1])+ (fib[i - 2] * fib[i - 2])) % MOD;
    //     }

    //     return fib[n];
    // }
    