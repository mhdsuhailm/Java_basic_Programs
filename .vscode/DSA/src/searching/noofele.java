package searching;

public class noofele {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findnum(nums));
    }
    static int findnum(int[] nums){
        int count = 0;
        for(int num : nums){
            if(even(num)){
                count ++;
            }
        }
        return count;
    }
    static boolean even(int num){
        int numberofdigit = digit(num);
        return numberofdigit % 2 == 0;
    }
    static int digit(int num){
        if(num < 0){
            num = num*-1;

        }
        if (num == 0){
            return 1;
        }
        int count = 0;
        while (num > 0){
            count ++;
        }
        return count;

    }
}
