package package_2;

// class test{
//     static String name;

//     public test(String name){
//         test.name = name;
//     }

// }

public class innerclass {
    
static class test{
    String name;

    public test(String name){
        this.name = name;
    }

}

   
    public static void main(String[] args) {
        test a = new test("abc");
        test b = new test("def");

        System.out.println(a.name);
        System.out.println(b.name);

    }
}
