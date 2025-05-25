package accenture;

import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s1 = in.nextLine();
        String s2 = in.nextLine();

        int val1 = count(s1);
        int val2 = count(s2);

        int diff = Math.abs(val1 - val2);

        if (diff % 2 == 0) {
            System.out.println("Even " + diff);
        } else {
            System.out.println("Odd " + diff);
        }
    }
    static int count(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') { 
                count++;
            }
        }

        return count;
    }
}
