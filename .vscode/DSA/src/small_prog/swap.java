package small_prog;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();

        // newName(name);
        System.out.println(name);
        // System.out.println(naam);
        // System.out.println(ans1);
        int a = 10;
        int b = 20;
        int temp = 0;

        System.out.println(a+""+b);
        swap(10,20);

    }
    

    // public static void newName(String name)
    // {
    //     name = "abc";
    //     System.out.println(name);
    //     // return name;
    // }
    public static void nname(String naam)
    {
        naam = "asdfg";
        System.out.println(naam);
    }

    public static void swap(int a , int b){
        int temp =  a;
         a =  b;
         b = temp;
        System.out.println(a+""+ b);
    }
}


