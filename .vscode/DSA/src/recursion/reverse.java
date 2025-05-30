package recursion;

public class reverse {
    public static void main(String[] args) {
        rev(1234);
        System.out.println(sum);
        System.out.println(rev2(4321));
        System.out.println(palindrome(12321));

    }
    static int sum =0;
    static void rev(int n){
        if(n == 0){
            return;
        }
        int rem = n%10;
        sum = sum * 10+rem;
        rev(n/10);
    }
    static int rev2(int n){
        // it will count no of digitd
        int digit = (int)Math.log10(n)+1;
        return logic(n,digit);
    }
    static int logic(int n,int digit){
        if(n%10 == n){
            return n;
        }
        int rem = n%10;
        return rem*(int)Math.pow(10,digit-1)+logic(n/10 , digit-1);
    }
    static boolean palindrome(int n){
        return n == rev2(n);
    }
}
