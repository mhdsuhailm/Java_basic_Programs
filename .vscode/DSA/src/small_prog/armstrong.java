package small_prog;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // System.out.println("enter a number");
        // int n = in.nextInt();
        // boolean ans = isarmstrong(n);
        // if (ans) {
        // System.out.println(n + " is an armstrong number.");
        // } else {
        // System.out.println(n + " is not an armstrong number.");
        // }
        // in.close();

        // Loop to find Armstrong numbers between 100 and 999
        for (int i = 0; i <= 1000; i++) {
            if (isarmstrong(i)) {
                System.out.println(i + " is an armstrong number.");
            }
        }
    }

    public static boolean isarmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem * rem * rem;
        }

        return sum == original;
    }
}

// package small_prog;

// import java.util.Scanner;

// public class armstrong {
//     public static void main(String[] args) {
        
//     Scanner in = new Scanner(System.in);
//     // System.out.println("enter a number");
//     // int n = in.nextInt();
//     // boolean ans = isamstrong(n);
//     // if (ans) {
//     //     System.out.println(n + " is a amstrong number.");
//     // } else {
//     //     System.out.println(n + " is not a amstrong number.");
//     // }
//     // in.close();

//     for (int i=0;i<=100;i++){
//         if(isamstrong(i)){
//             System.out.println(i+" ");
//         }
//     }
//     }
//     public static boolean isamstrong (int n){
//         int original = n;
//         int sum =0;

//         while (n>0){
//             int rem = n%10;
//             n = n/10;
//             sum = sum + rem*rem*rem; 

//         }
//         if (sum == original){
//             return true;
//         }
//         return false;
//     }

    
// }
