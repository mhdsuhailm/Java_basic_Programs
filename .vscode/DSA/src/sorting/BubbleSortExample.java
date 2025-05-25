package sorting;

// import java.util.Arrays;

// public class bubblesort {
//     public static void main(String[] args) {
//         int[] arr={6,5,4,3,2,1};
//         sort(arr);
//         System.out.println(Arrays.toString(arr));
//     }
//     public static void sort(int[] arr){
//         boolean swaped;

//         for(int i=0;i<arr.length;i++){
//             swaped = false; 
//             for(int j=1;j<arr.length;j++){
//                 if(arr[j] < arr[j-1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j-1];
//                     arr[j-1] = temp;
//                     swaped = true;
//                 }
//             }
//             if(!swaped){
//                 break;
//             }
//         }
//     }
// }
import java.util.Arrays;

public class BubbleSortExample {
    public static void main(String[] args) {
        int[] arr = { 6, 5, 4, 3, 2, 1 }; // Example array
        bubbleSort(arr);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr) {
        boolean swapped;

        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            System.out.println("Pass " + (i + 1) + ":");

            // Reduce the range with each pass since the last i elements are already sorted
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    // Swap elements
                    int temp = arr[j]; 
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
                System.out.println("  After comparing index " + (j - 1) + " and " + j + ": " + Arrays.toString(arr));
            }

            if (!swapped) {
                System.out.println("  No swaps happened. Array is already sorted.");
                break;
            }

            System.out.println(); // Empty line between passes
        }
    }
}
