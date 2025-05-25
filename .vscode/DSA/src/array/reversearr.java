package array;

import java.util.Arrays;

import small_prog.reverse;

public class reversearr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int start =0;
        int end = arr.length-1;

        while (start < end){
            swap(arr,start,end);
            start++;
            end--;

        }
    }

    static void swap(int[] arr , int inds , int inde){
        int temp = arr[inds];
        arr[inds] = arr[inde];
        arr[inde] = temp;


    }
}
