package sorting;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr ={3,1,5,4,2,4,3,5,7,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        for(int i = 0; i < arr.length;i++){
            int last = arr.length-1-i;
            int maxindex = getmaxindex(arr,0,last);
            swap(arr,maxindex,last);
        }}
    static int getmaxindex(int[] arr, int first,int last){
        int max = first;
        for (int i = 0; i <= last; i++) {
            if(arr[max] < arr[i]){
                max = i;
                System.out.println(max);
            }
        }
        return max;
    }
    static void swap(int[] arr,int first,int last){
        int temp = arr[first];
        arr[first] = arr [last];
        arr[last] = temp;
    }
    
    }

