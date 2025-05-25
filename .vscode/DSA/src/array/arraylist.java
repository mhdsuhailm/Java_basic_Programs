package array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(10); 
        Scanner in = new Scanner(System.in);
        System.out.println(" no for initial");
        int x = in.nextInt();
        System.out.println("enter a integer");
        for(int i=0; i < x; i++ ){
            try{
                int number = in.nextInt();
                list.add(number);
            }
            catch(NumberFormatException e){
                System.out.println("enter a valid number");
                i--;

            }
        }
        Integer[] array = new Integer[list.size()];
        array =list.toArray(array);
        System.out.println(Arrays.toString(array));
        for (int num : array){
            System.out.println(num);
        }
    }
}
