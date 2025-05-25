package package_2;

public class main {
    public static void main(String[] args) {
        human snail = new human( 22,"snail",10000,false);
        human vadakan = new human(34,"vadakan",150000,true);

        System.out.println(snail.population);
        // System.out.println(human.population);

        

    }

    static void fun(){
        main obj = new main();

        obj.greeting();
    }
    void fun1(){
        greeting();
    }

    void greeting(){
        System.out.println("hello world");
    }
    
}
