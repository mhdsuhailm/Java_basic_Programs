package accenture;

import java.util.*;

public class p7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine(); // Consume the newline character

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextLine(); // Properly read each string
        }
        System.out.println("Input strings: " + Arrays.toString(arr));
        int result = maxper(arr);
        System.out.println(result);
    }

    private static int maxper(String[] arr) {
        int maxFactorial = 0;
        for (String s : arr) {
            String novowel = remove(s);
            int factorialValue = factorial(novowel.length());
            if (factorialValue > maxFactorial) {
                maxFactorial = factorialValue;
            }
        }
        return maxFactorial;
    }

    private static int factorial(int length) {
        // if (length == 0) {
        //     return 1; 
        // }

        int fact = 1;
        for (int i = 2; i <= length; i++) {
            fact *= i;
        }
        return fact;
    }

    private static String remove(String s) {
        return s.replaceAll("[aeiouAEIOU]", "");
    }
}
