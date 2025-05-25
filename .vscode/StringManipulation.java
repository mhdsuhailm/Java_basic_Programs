import java.util.Arrays;

class StringManipulation {
    public static String sortWords(String input) {
        if (input == null) {
            return null;
        }

        String[] words = input.trim().split(" ");

        Arrays.sort(words);

        return String.join(" ", words);
    }

    public static void main(String[] args) {
        System.out.println(sortWords("banana apple orange grape")); 
        System.out.println(sortWords("zebra lion tiger elephant")); 
        System.out.println(sortWords("hello world")); 
        System.out.println(sortWords("")); 
    }
}
