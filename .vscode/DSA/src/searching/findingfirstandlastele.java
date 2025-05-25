package searching;

import java.util.Arrays;

public class findingfirstandlastele {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 3, 3, 3, 3, 3, 6, 7, 8, 9 };
        int target = 3;
        int[] ans = { -1, -1 };
        // boolean isfirst;
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        System.out.println(Arrays.toString(ans));

    }

    static int search(int[] nums, int target, boolean isfirst) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while ((start <= end)) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (isfirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return ans;
    }
}
