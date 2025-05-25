package pattern;

public class pattern1 {
    public static void main(String[] args) {
        int n=5;
        pattern(5);
    }
    static void pattern(int n){
        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    
    public static void alphaRamp(int n) {
        // Write your code here
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (char j = 'A'; j <= ch; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
            ch += 1;
        }
    }

    // A 
    // B B 
    // C C C
    public static void nLetterTriangle(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    
    // A 
    // A B 
    // A B C
    public static void nNumberTriangle(int n) {
        // Write your code here
        int num = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num = num + 1;
            }
            System.out.println();
        }
    }
    // 1
    // 2 3 
    // 4 5 6
    public static void numberCrown(int n) {
        // Write your code here.
        int space = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
            space -= 2;
        }
    }
    // 1         1 
    // 1 2     2 1 
    // 1 2 3 3 2 1 
    public static void nBinaryTriangle(int n) {
        // Write your code here.
        int start = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                start = 0;
            } else {
                start = 1;
            }
            for (int j = 0; j < i; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }
    // 1 
    // 0 1 
    // 1 0 1
    public static void jnStarTriangle(int n) {
        // Write your code here
        for (int i = 1; i <= 2 * n - 1; i++) {
            int star = i;
            if (i > n) {
                star = 2 * n - i;
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // *  
    // ** 
    // ***
    // ** 
    // *  
    public static void nStarDiamond(int n) {
        // Write your code here

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int z = 0; z < (i * 2) + 1; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * (n - i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//   *  
//  *** 
// *****
// *****
//  *** 
//   *  
    public static void unStarTriangle(int n) {
    // Write your code here
    for (int i = 0; i < n; i++) {
        String space = " ".repeat(i);
        String star = "*".repeat(2 * (n - i) - 1);
        System.out.println(space + star);
    }
}
public static void nyStarTriangle(int n) {
        // Write your code here
        for(int i=0;i<n;i++){
            String space = " ".repeat(i);
            String star = "*".repeat(2*(n-i)-1);
            System.out.println(space+star);
        }
    }
    
    public static void nStarTriangle(int n) {
        // Write your code here
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int z = 0; z < (2 * i) + 1; z++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
//   *  
//  *** 
// *****
public static void alphaTriangle(int n) {
        // Write your code here
        for(int i=0;i<n;i++){
            char ch= (char)('A'+(n-1));
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
                ch--;
            }
            System.out.println();
        }
    }
// C 
// C B 
// C B A 
public static void symmetry(int n) {
    // Write your code here
    int s = 0;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n - i; j++) {
            System.out.print("* ");
        }
        for (int j = 0; j < s; j++) {
            System.out.print(" ");
        }
        for (int j = 0; j < n - i; j++) {
            System.out.print("* ");
        }
        s += 4;
        System.out.println();
    }
    int s1 = 8;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        for (int j = 0; j < s1; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= i; j++) {
            System.out.print("* ");
        }
        s1 -= 4;
        System.out.println();
    }
}
// * * * * * * 
// * *     * * 
// *         * 
// *         * 
// * *     * * 
// * * * * * * 
public static void symmetry1(int n) {
    // Write your code here
    int space = (2 * n) - 2;
    for (int i = 1; i <= 2 * n - 1; i++) {
        int stars = i;
        if (i > n) {
            stars = 2 * n - i;
        }
        for (int j = 1; j <= stars; j++) {
            System.out.print("* ");
        }
        for (int j = 1; j <= space; j++) {
            System.out.print(" ");
        }
        for (int j = 1; j <= stars; j++) {
            System.out.print("* ");
        }

        System.out.println();
        if (i < n) {
            space -= 2;
        } else {
            space += 2;
        }
    }
}
// *         * 
// * *     * * 
// * * * * * * 
// * *     * * 
// *         * 
public static void ogetStarPattern(int n) {
    // Write your code here
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            if (i == 0 || i == n - 1 || j == 0 || j == n - 1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}
***
* *
***


}
