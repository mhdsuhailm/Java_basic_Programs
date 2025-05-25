package infosys;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine(); // Read the input as a string

        int evenSum = 0;
        int oddSum = 0;

        // Process each character in the input string
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                int digit = Character.getNumericValue(c); // Convert char to int

                if (digit % 2 == 0) {
                    evenSum += digit;
                } else {
                    oddSum += digit;
                }
            } else {
                System.out.println("Invalid input: " + c + " is not a digit.");
            }
        }

        // Print the results
        System.out.println("Sum of even digits: " + evenSum);
        System.out.println("Sum of odd digits: " + oddSum);
    }
}
