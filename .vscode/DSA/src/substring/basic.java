package substring;

public class basic {
    public static void main(String[] args) {
        // System.out.println(skip("bananna"));
        System.out.println(skip2("banappleana"));
    }
    
    private static void skip(String p, String s) {
        if (s.isEmpty()) {
            System.out.println(p);
        }
        char ch = s.charAt(0);
        if (ch == 'a') {
            skip(p, s.substring(1));
        } else {
            skip(p + ch, s.substring(1));
        }
    }

    private static String skip1(String s) {
        if (s.isEmpty()) {
            return "";
        }
        char ch = s.charAt(0);
        if (ch == 'a') {
            return skip1(s.substring(1));
        } else {
            return ch + skip1(s.substring(1));
        }
    }

    private static String skip2(String s) {
        if (s.isEmpty()) {
            return "";
        }

        if (s.startsWith("apple")) {
            return skip2(s.substring(5));
        } else {
            return s.charAt(0) + skip2(s.substring(1));
        }
    }
}
