package small_prog;

import java.util.Scanner;

public class maxnum {
    public static void main(String[] args) {
        System.out.println(" enter three valhes");
        Scanner in = new Scanner(System.in);
        int a,b,c;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

        int max = a;
        if (b > max){
            max = b;
        }
        if (c>max){
            max = c;
        }
        System.out.println(max);

    }
}
