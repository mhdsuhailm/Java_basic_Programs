package accenture;

import java.util.*;

class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double n = in.nextDouble(); // Use nextDouble() to read a double value

        double ans = 3.14 * n * n; // Calculate the area of a circle

        // Use Math.round to round the result to the nearest integer
        System.out.println((int) Math.round(ans));
    }
}
