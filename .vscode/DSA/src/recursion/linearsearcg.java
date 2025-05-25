package recursion;

import java.util.ArrayList;

public class linearsearcg {
    public static void main(String[] args) {
        int[] arr={1,2,3,3,4,5};
        // int target = 3;
        // int i=0;
        // int ans = ls(arr, target,i);
        // System.out.println(ans);
        System.out.println(ls1(arr, 3, 0, new ArrayList<>()));

    }
    static int ls(int[] arr,int target,int i){
        if(i > arr.length){
            return -1;
        }
        if(arr[i] == target){
            return i;
        }return ls(arr,target,i+1);
    }
    static ArrayList<Integer> ls1(int[] arr,int target,int i,ArrayList<Integer> list){
        if(i == arr.length){
            return list;
        }
        if(arr[i] == target){
            list.add(i);
        }return ls1(arr, target, i+1, list);
    }
}
