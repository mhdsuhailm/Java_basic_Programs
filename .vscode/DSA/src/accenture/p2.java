package accenture;
import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int h = in.nextInt();
        int v1 = in.nextInt();
        int v2 = in.nextInt();

        // Perform floating-point division to get a precise coefficient of restitution
        double e = (double) v1 / v2;

        // Calculate the rebound height after 1 bounce
        double h1 = h * (e * e);

        // Round the result
        int roundedHeight = (int) Math.round(h1);

        // Print the rounded result
        System.out.println(roundedHeight);
    }
}
