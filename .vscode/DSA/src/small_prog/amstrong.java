package small_prog;

import java.util.Scanner;

public class amstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(amstrong(n));
    }
    static boolean amstrong(int n){
        int m = n;
        int d = 0;
        int ans = 0;
        while (n > 0) {
            d = n % 10;
            ans = ans + d * d*d;
            n = n / 10;
        }
        System.out.println(ans);
        if (ans == m) {
            return true;
        }
        return false;
    }
}
