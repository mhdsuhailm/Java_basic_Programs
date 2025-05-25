package accenture;

import java.util.Scanner;

public class p1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = in.nextInt();
        char c = in.next().charAt(0);

        int count =0;
        s = s.toLowerCase();
        c=Character.toLowerCase(c);
        for(char ans : s.toCharArray()){
            if(c == ans){
                count ++;
            }
        }
        System.out.println(count);;
    }
}
