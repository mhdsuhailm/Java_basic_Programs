package subsequense;

import java.util.ArrayList;

public class string {
     public static void main(String[] args) {
//        com("","abc");
        System.out.println(subseq("","abc"));
    }
    static void com(String p,String s){
        if(s.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = s.charAt(0);
        com(p+ch,s.substring(1));
        com(p,s.substring(1));
    }
    static ArrayList<String> subseq(String p,String s){
        if(s.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = s.charAt(0);
        ArrayList<String> left = subseq(p+ch,s.substring(1));
        ArrayList<String> right = subseq(p,s.substring(1));
        left.addAll(right);
        return left;
    }
}
