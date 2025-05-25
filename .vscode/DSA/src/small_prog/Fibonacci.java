package small_prog;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = 0;
        int c = 1;
        int count = 2;

        // Handle the case for the first Fibonacci number
        if (a == 1) {
            System.out.println(b);
            return;
        }

        // Loop to calculate the Fibonacci sequence
        while (count <= a) {
            int temp = c;
            c = b + c;
            b = temp;
            count++;
        }

        System.out.println(b);
    }
}

// package small_prog;

// import java.util.Scanner;

// public class ffibanocii {
//     Scanner in = new Scanner(System.in);
//     int a = in.nextInt();
//     int b = 0;
//     int c = 1;
//     int count = 2;
//     while(count <= a){
//         int temp= c;
//         c = b + c;
//         b = temp;
//     } 
//     System.out.println(c);
// }
