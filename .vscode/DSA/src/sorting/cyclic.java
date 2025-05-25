package sorting;
import java.util.Arrays;

public class cyclic {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int i =0;
        while(i < arr.length){
            int correctind = arr[i] - 1;
            if (arr[i] != arr[correctind]){
                swap(arr,i,correctind);
            }
            else{
                i++;
            }
        }
    }
    private static void swap(int[] arr, int i, int correctind) {
        int temp = arr[i];
        arr[i] = arr[correctind];
        arr[correctind] = temp;
    }
}
