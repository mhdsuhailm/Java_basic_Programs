package polymorph;

public class circle extends shapes{
    //the child class circe will override the parrent class shape
    // which has same void area if the child class was called


    @Override // annoation
    
    void area() {
        System.out.println("circle");
    }
}
