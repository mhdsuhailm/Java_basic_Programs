package sorting;

import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int[] arr ={2,3,4,56,1};
        sort(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] arr,int s,int e){
        if( s >= e-1){
            return;
        }
        int mid = s+(e-s)/2;
        sort(arr, s, mid);
        sort(arr,mid,e);

        intsort(arr,s,mid,e);

    }
    static void intsort(int[] arr,int s,int mid,int e){
        int[] mix=new int[e-s];
        int i=s;
        int j=mid;
        int k =0;

        while(i < mid && j <e){
            if (arr[i] <= arr[j]) {
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;                
            }
            k++;
        } 
        while(i < mid){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }
        for(int l=0;l<mix.length;l++){
            arr[s+l] = mix[l];
        }
    }
}
