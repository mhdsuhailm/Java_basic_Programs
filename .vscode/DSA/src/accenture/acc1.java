package accenture;

import java.lang.reflect.Array;
import java.util.Arrays;

public class acc1 {
        public static void main(String[] args) {


        // Uncomment these lines if you want to take input from the user
        // int n = sc.nextInt();
        // int k = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        // arr[i] = sc.nextInt();
        // }

        int n = 5;
        int k = 2;
        int[] arr = {1,2,3,4,5 };
        int ans = 0;

        for (int i = 0; i < n - k + 1; i++) {
            int[] subArr = new int[k];
            System.arraycopy(arr, i, subArr, 0, k);
            // System.out.println(Arrays.toString(subArr)+subArr.getClass().getSimpleName());

            int sum = 0;
            for (int ind = 1; ind <= k; ind++) {
                sum += subArr[ind - 1] * ind;
            }

            if (sum > ans) {
                ans = sum;
            }
        }

        System.out.println(ans);
    }
}
