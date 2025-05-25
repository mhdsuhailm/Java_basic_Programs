package package1;


public class Box {
    double le;
    double h;
    double w;
//    double weight;

    static void greeting() {
        System.out.println("Hey, I am in Box class. Greetings!");
    }

    public double getL() {
        return le;
    }

    Box () {
        this.h = -1;
        this.le = -1;
        this.w = -1;
    }

    // cube
    Box (double side) {
        // super(); Object class
        this.w = side;
        this.le = side;
        this.h = side;
    }

    Box(double le, double h, double w) {
        // System.out.println("Box class constructor");
        this.le = le;
        this.h = h;
        this.w = w;
    }

    Box(Box old) {
        this.h = old.h;
        this.le = old.le;
        this.w = old.w;
    }
    public void information(){
        System.out.println("running the box");
    }
}

