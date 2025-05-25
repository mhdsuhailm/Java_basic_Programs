package searching;

public class binarysearch {
    public static void main(String[] args) {
        // int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        int target = 8;
        int ans = search(arr, target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isasc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isasc) {
                if (target < arr[mid]) {
                    end = mid - 1;

                }
                // else if(target > arr[mid]) {
                else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;

                } else {
                    start = mid + 1;
                }

            }
        }
        return -1;
    }
}
