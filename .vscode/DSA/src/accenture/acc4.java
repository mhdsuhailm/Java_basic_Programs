package accenture;

import java.util.Scanner;

public class acc4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        String s = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Initialize an array to count vowels
        int[] vowelCount = new int[5];
        char[] vowels = { 'a', 'e', 'i', 'o', 'u' };

        // Iterate through the string and count vowels
        for (char ch : s.toLowerCase().toCharArray()) {
            switch (ch) {
                case 'a':
                    vowelCount[0]++;
                    break;
                case 'e':
                    vowelCount[1]++;
                    break;
                case 'i':
                    vowelCount[2]++;
                    break;
                case 'o':
                    vowelCount[3]++;
                    break;
                case 'u':
                    vowelCount[4]++;
                    break;
            }
        }

        // Find the most frequent vowel
        int maxCount = 0;
        char mostFrequentVowel = ' ';
        for (int i = 0; i < vowels.length; i++) {
            if (vowelCount[i] > maxCount) {
                maxCount = vowelCount[i];
                mostFrequentVowel = vowels[i];
            }
        }

        // Print the most frequent vowel
        System.out.println(mostFrequentVowel);
        System.out.println(maxCount);
    }
}