package infosys;

import java.util.Scanner;

public class game {
    public static int countDivisors(int n) {
        if (n <= 1) {
            return 0;
        }
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (i != n)
                    count++;
                if (i != 1 && i != n / i)
                    count++;
            }
        }
        return count;
    }

    // Function to determine the winner of the game
    public static String predictWinner(int[] numbers) {
        int totalMoves = 0;
        for (int num : numbers) {
            totalMoves += countDivisors(num);
        }

        // Determine the winner based on the total number of moves
        return (totalMoves % 2 == 1) ? "AMAN" : "JASBIR";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading the number of integers
        System.out.println("Enter the number of integers:");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        // Reading the integers
        System.out.println("Enter the integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Determine and print the winner
        String winner = predictWinner(numbers);
        System.out.println(winner);

        scanner.close();
    }
}
