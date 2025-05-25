package package_2;

public class human {
    int age;
    String name;
    int salary;
    boolean relationship;
    long population;
    // static long population;

    public human(int age,String name,int salary,boolean relationship){
        this.age = age;
        this.name = name;
        this.salary =salary;
        this.relationship = relationship;
        this.population += 1;
        // human.population +=1;

    }
}
