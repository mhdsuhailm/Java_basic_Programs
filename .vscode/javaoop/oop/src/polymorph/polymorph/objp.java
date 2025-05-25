package polymorph;

public class objp {
    int num;

    public objp(int num){
        this.num = num;
    }
    // @Override

    // public String toString(){
    //     return  "obj{"+"num="+num+"}";
    // }

    public static void main(String[] args) {
        objp obj = new objp(54);
        System.out.println(obj);
    }
}
