package accenture;

import java.util.*;

class Main1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        in.nextLine(); // Consume the newline character

        String[] s = new String[n];

        for (int i = 0; i < n; i++) {
            s[i] = in.nextLine();
        }

        System.out.println(answer(s, n));
    }

    static int answer(String[] s, int n) {
        int maxversion = -1;

        for (int i = 0; i < n; i++) {
            String[] parts = s[i].split("-");

            if (parts.length == 2 && parts[0].equals("File")) {
                try {
                    int version = Integer.parseInt(parts[1]);

                    if (version > maxversion) {
                        maxversion = version;
                    }
                } catch (NumberFormatException e) {
                    // Handle the case where parts[1] is not a valid integer
                }
            }
        }

        return maxversion; // Return the highest version found
    }
}
