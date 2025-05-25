package package_2;

public class stat {
    static int a = 4;
    static int b;


    //will run only once,when the first object is created is loaded for the secomd time
    static {
        System.out.println("i am static block");
        b = 2*a;
    }
    public static void main(String[] args) {

        // stat obj = new stat();
        System.out.println(stat.a+" "+stat.b);

        stat.b+=3;
        System.out.println(stat.b);

        // stat obj1 = new stat();
        System.out.println(stat.a+" "+stat.b);

        
    }
    
}
