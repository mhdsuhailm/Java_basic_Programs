package array;

import java.util.Arrays;
import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        
    
    Scanner in = new Scanner(System.in);
    int[] arr = new int[6];

    // for(int i=0;i<arr.length;i++){
    //     arr[i] =in.nextInt();
    //     System.out.println(Arrays.toString(arr));
    // }

    // for (int num : arr){
    //     System.out.println(num+" ");
    // }
    // System.out.println(Arrays.toString(arr));

    int[][] arr2 = new int[3][3]; 

    for (int row = 0 ; row < arr2.length; row++){
        for (int col=0; col < arr2[row].length; col++)
        {
            arr2[row][col] = in.nextInt();
            System.out.print(arr2[row][col]);
        }
        System.out.println();
    }

    for (int row = 0 ; row < arr2.length; row++){
        System.out.println(Arrays.toString(arr2[row]));
    }
    for( int[] a : arr2){
        System.out.println(Arrays.toString(a));
    }
}}
