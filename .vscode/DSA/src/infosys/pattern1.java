package infosys;

public class pattern1 {
     public static void printPattern(String input) {
        int n = input.length();
        
        for (int i = 0; i < n; i++) {
            String line = "";
            
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    line += input.charAt(i);
                } else if (j == n - i - 1) {
                    line += input.charAt(n - i - 1);
                } else {
                    line += ' ';
                }
            }
            
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        String input = "geeks";
        printPattern(input);
    }
}

