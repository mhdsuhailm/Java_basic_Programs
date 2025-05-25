package searching;

import java.util.Arrays;

public class search2d {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5},
            {6,7,8}
        };
        int target = 7;
        int[] ans= search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr ,int target){
        for(int r=0;r<arr.length;r++){
            for(int c=0;c<arr[r].length;c++){
                if(arr[r][c] == target){
                    return new int[]{r,c};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
