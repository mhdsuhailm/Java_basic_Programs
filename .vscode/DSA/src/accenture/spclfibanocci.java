package accenture;

import java.util.*;

public class spclfibanocci {
    static Map<Integer, Integer> memo = new HashMap<>();
    public static void main(String[] args) {
        int n=10;
        System.out.println(fibonacci(n));
        
    }

    static int fibonacci(int n) {
       if(n<2){
        return n;
       }
       if(memo.containsKey(n)){
        return memo.get(n);
       }
       int result = (fibonacci(n - 1) * fibonacci(n - 1) + fibonacci(n - 2) * fibonacci(n - 2)) % 47;
       memo.put(n,result);
       return result;
    }
}
