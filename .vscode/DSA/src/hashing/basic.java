// package hashing;

// import java.util.Scanner;

// public class basic {
//     public static void main(String[] args) {
       
//         Scanner in = new Scanner(System.in);
//         int n = in.nextInt();
//         int[] arr = new int[n];
//         for(int i=0;i<n;i++){
//             arr[i] = in.nextInt();
//         }

//         int[] hash = new int[100];
//         for(int i = 0 ;i<n;i++){
//             hash[arr[i]] +=1;
//         }

//         int q = in.nextInt();
//         while(q-- > 0){
//             int number = in.nextInt();
//             System.out.println(hash[number]);
//         }

//     }
// }
package hashing;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Step 1: Read size of the array
        System.out.print("Enter the size of the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        // Step 2: Read array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println("Input array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Step 3: Initialize the hash array
        int[] hash = new int[101]; // Assuming values are within the range [0, 100]

        // Step 4: Count frequency of elements
        System.out.println("Counting frequencies...");
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
            System.out.println("Element " + arr[i] + " count: " + hash[arr[i]]);
        }

        // Step 5: Process queries
        System.out.print("Enter the number of queries: ");
        int q = in.nextInt();
        System.out.println("Enter the numbers to query:");
        while (q-- > 0) {
            int number = in.nextInt();
            System.out.println("Frequency of " + number + ": " + hash[number]);
        }

        in.close();
    }
}
