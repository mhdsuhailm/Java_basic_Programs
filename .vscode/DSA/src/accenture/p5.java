// package accenture;
// import java.util.ArrayList;
// import java.util.Collections;
// public class p5 {
//     public static void main(String[] args) {
//         int[] arr={11,1,2,11,15,7};
//         int n = arr.length - 1;
//         int a =0;int b=0;
//         ArrayList<Integer> list= new ArrayList<>();
//         for (int i=0;i<n;i++){
//             for(int j=i+1;j<n;j++){
//                 if (arr[i]+arr[j] == 18){
//                     a = arr[i];
//                     b = arr[j];
//                     if(arr[i]*arr[j] > a*b){
//                         a=arr[i];
//                         b=arr[j];
//                     }
//                 }
//             }
//         }
//         // list.add(a);
//         // list.add(b);
//         // Collections.sort(list, Collections.reverseOrder());
//         // System.out.println(list);
//         if (a != -1 && b != -1) {
//             list.add(a);
//             list.add(b);
//             Collections.sort(list, Collections.reverseOrder());
//             System.out.println(list);
//         } else {
//             System.out.println("No valid pair found");
//         }
//     }
// }
package accenture;

import java.util.ArrayList;
import java.util.Collections;

public class p5 {
    public static void main(String[] args) {
        int[] arr = { 11, 1, 2, 11, 15, 7 }; // Example array
        int n = arr.length;
        int a = -1, b = -1; // Initialize to -1 to indicate no valid pair found initially
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { // Start j from i + 1 to avoid comparing an element with itself
                if (arr[i] + arr[j] == 18) {
                    if (arr[i] * arr[j] > a * b) {
                        a = arr[i];
                        b = arr[j];
                    }
                }
            }
        }

        // Check if a valid pair was found
        if (a != -1 && b != -1) {
            list.add(a);
            list.add(b);
            Collections.sort(list, Collections.reverseOrder());
            System.out.println(list);
        } else {
            System.out.println("No valid pair found");
        }
    }
}
