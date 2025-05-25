package accenture;

import java.util.*;

public class acc2 {
    public static void main(String[] args) {
        // Scanner for input
        Scanner sc = new Scanner(System.in);

        // Assuming n = 3
        int n = 3;
        int[] arr = { 10, 20, 30 };
        int total_cho_a = 0;

        for (int box : arr) {
            total_cho_a += (box / 3);
            if (box % 3 != 0) {
                total_cho_a += 1;
            }
        }

        System.out.println(total_cho_a);
    }
}


// public class jarchoc {
//     public static void main(String[] args) {
//         int n = 3;
//         int[] arr = {10,20,30};
//         int stu_a = 0;
//         for (int a : arr){
//             // System.out.println(a);
//             stu_a += (a/3);
//             System.out.println(stu_a);
//             if(a % 3 != 0 ){
//                 stu_a += 1;
//              }
            

//         }
//         System.out.println(stu_a);
//     }
    
// }
