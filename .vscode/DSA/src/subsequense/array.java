package subsequense;

import java.util.ArrayList;

public class array {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = {1,2,3};
        subseq(0, arr, arr.length, list);
    }
    static void subseq(int i,int[] arr,int n,ArrayList<Integer> list){
        if (i == n) {
            
            System.out.println(list);
            return;
        }
        subseq(i+1, arr, n, list);
        list.add(arr[i]);
        subseq(i+1, arr, n, list);
        list.remove(list.size()-1);
    }
}
