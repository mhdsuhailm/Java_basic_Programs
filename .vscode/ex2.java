public class ex2 {
    public static void main(String [] args){

        //constructor
        Student s1 = new Student(18, "hii",59.56f);
        System.out.println(s1.rno);
        System.out.println(s1.name);
        System.out.println(s1.marks);
        // s1.name="snail";
        // s1.rno=80;
        // s1.marks=87.99f;
        Student s2 = new Student();
        System.out.println(s2.marks);
        s1.greeting();
        Student random = new Student(s1);
        System.out.println(random.name);

        int[] rollno = new int[5];
        String[] name = new String[5];
        double[] mark = new double[5];

        // calling one constructor by other constructor
        Student one = new Student();
        Student two = one;

        Student[] students= new Student[5];



    }
}
class Student{
    int rno;
    String name;
    float marks=99.9f;


    //function
    void greeting(){
        System.out.println("hello my name is "+name);
    }


    Student (Student other) {
        this.rno = other.rno;
        this.name= other.name;
        this.marks=other.marks;
    
    }

Student () {
    this.rno = 19;
    this.name="snail";
    this.marks=89.99f;

}

Student (int roll,String name,float marks) {
    rno = roll;
    this.name = name;
    marks = marks;

}
}