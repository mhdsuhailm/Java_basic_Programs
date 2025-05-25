package small_prog;

public class shadowing {
    static int x = 100;
    public static void main(String[] args) {
        System.out.println(x);
        int x = 10; //old got shdowed by this
        System.out.println(10);
        {
            int y = 10;
            System.out.println(y);
        }
        int y = 100;
        System.out.println(y);
    }
    public static void oooh(){
        
        System.out.println(x);

    }
}
