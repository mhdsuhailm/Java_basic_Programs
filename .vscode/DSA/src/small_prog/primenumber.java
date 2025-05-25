package small_prog;

import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        boolean ans = isprime(n);
        if (ans) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
        in.close();
    }

    public static boolean isprime(int n) {
        if (n <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        if (n==2){
            return true;
        }
        if (n%2==0){
            return false;
        }
        int c = 3;
        while (c * c <= n) {
            if (n % c == 0) {
                return false; // Number is not prime
            }
            c+=3;
        }
        return true; // Number is prime
    }
}

// package small_prog;

// import java.util.Scanner;

// public class primenumber {
//     public static void main(String[] args) {
        
//     Scanner in = new Scanner(System.in);
//     int n = in.nextInt();
//     boolean ans = isprime(n);
//     System.out.println(ans+"it is prime");
//     }

//     public static boolean isprime(int n){

//         if(n<=1){
//             System.out.println("not prime");
//             return false;
//         }
//         int c = 2;
//         while (c*c <= n){
//             if (n%c==0){
//             System.out.println("it is not aprime");
//             return false;
            
//         }
//         c++;
//         }
//         if(c*c>n){
//         System.out.println("it is a prime");
//         return true;
//         }
        

//     }
    
// }
