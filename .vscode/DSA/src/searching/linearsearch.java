package searching;

public class linearsearch {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,0};
        int target = 10;
        int ans = linearsearch(nums,target);
        System.out.println(ans);
    }

    static int linearsearch(int[] nums,int target){
        if(nums.length == 0){
            return -1;
        }

        for(int index = 0;index < nums.length ; index++){
            int element = nums[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
    
    static int linearsearch1(int[] nums, int target) {
        if (nums.length == 0) {
            return Integer.MAX_VALUE;
        }

        for (int index = 0; index < nums.length; index++) {
            int element = nums[index];
            if (element == target) {
                return element;
            }
        }
        return Integer.MAX_VALUE;
    }
    
    static boolean linearsearch2(int[] nums, int target) {
        if (nums.length == 0) {
            return false;
        }

        for (int index = 0; index < nums.length; index++) {
            int element = nums[index];
            if (element == target) {
                return true;
            }
        }
        return false;
    }
}
