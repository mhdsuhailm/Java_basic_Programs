package infosys;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class DayOfWeekExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the day (1-31): ");
        int day = scanner.nextInt();

        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter the year (e.g., 2024): ");
        int year = scanner.nextInt();

        try {
            // Create a LocalDate object with the given day, month, and year
            LocalDate date = LocalDate.of(year, month, day);

            // Get the day of the week
            String dayOfWeek = date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH);

            // Display the result
            System.out.println("The day of the week is: " + dayOfWeek);
        } catch (Exception e) {
            System.out.println("Invalid date. Please check the inputs.");
        }

        scanner.close();
    }
}
