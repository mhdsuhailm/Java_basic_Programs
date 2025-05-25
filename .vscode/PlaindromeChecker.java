class StringManipulation {
    public static boolean isPalindrome(String str) {
        StringBuilder builder = new StringBuilder(str.replaceAll("[^A-Za-z0-9]", "").toLowerCase());
       
        String reversed = String.valueOf(builder.reverse());
        System.out.println(reversed);
        return reversed.equals(str);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal, Panama"));
    }
}

// public class PlaindromeChecker {
//     public static boolean isPalindrome(String str) {
//         String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

//         System.out.println(cleanedStr);

//         int left = 0, right = cleanedStr.length() - 1;
//         while (left < right) {
//             if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
//                 return false;
//             }
//             left++;
//             right--;
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         String str = "A man, a plan, a canal, Panama";

//         System.out.println(isPalindrome("A man, a plan, a canal, Panama"));
//     }
// }
