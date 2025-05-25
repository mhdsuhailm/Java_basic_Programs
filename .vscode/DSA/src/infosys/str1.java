package infosys;

import java.util.Scanner;

public class str1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int count =0;

        for(int i=1;i<s.length();i++){
            if(Character.toLowerCase(s.charAt(i)) >= Character.toLowerCase(s.charAt(i-1)) ){
                count ++;
            }
            else{
                break;
            }
        }
        System.out.println(count);
    }
}

// package infosys;

// import java.util.Scanner;

// public class str1 {
// public static void main(String[] args) {
//     String a = "abcdojshdf";

//     int i,s=0;
//     for(i=0;i<a.length();i++){
//           if(  ((int)a[i]) - 96 == i+1 ) ||  ((int) a[i]-64 == i+1))
// {
// s=s+1;//4

// }

// System.out.println(s);
//     }
// }}