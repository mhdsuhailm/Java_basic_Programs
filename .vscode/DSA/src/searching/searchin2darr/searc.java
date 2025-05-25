package searching.searchin2darr;

import java.util.Arrays;

public class searc {
    public static void main(String[] args) {
        int[][] arr={
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {28, 29 ,37,47},
            {33, 34, 39, 49},
        };
        System.out.println(Arrays.toString(search(arr,35)));

    }
    static int[] search(int[][] arr, int target){
        int r=0;
        int c=arr.length-1;

        while(r < arr.length && c >= 0){
            if(arr[r][c] == target){
                return new int[]{r,c};
            }
            if(arr[r][c] < target){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
