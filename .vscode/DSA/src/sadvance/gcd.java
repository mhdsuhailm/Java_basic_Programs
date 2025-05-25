package sadvance;

public class gcd {
    public static void main(String[] args) {
        int a = 9;
        int b=18;
        System.out.println(lcm(a,b));
        System.out.println(gcd1(a, b));

    }
    static int gcd1(int a, int b){
        if(a == 0){
            return b;
        }return gcd1(b%a,a);
    }
    static int lcm(int a,int b){
        return (a*b)/gcd1(a, b);
    }
}
