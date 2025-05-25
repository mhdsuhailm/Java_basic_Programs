package array;
import java.util.*;

public class multiarraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> multilist = new ArrayList<>();
        Scanner in = new Scanner(System.in);

        System.out.println("enter no of rows");

        int no_of_rows = in.nextInt();
        for(int i =0;i<no_of_rows;i++){
            ArrayList<Integer> row = new ArrayList<>();
            System.out.println("enter the number of elements for row" +(i+1)+";");
            int numberOfElements = in.nextInt();

            System.out.println("Enter the elements for row " + (i + 1) + ":");
            for (int j = 0; j < numberOfElements; j++) {
                row.add(in.nextInt());
            }
            multilist.add(row);
        }

        System.out.println("The multidimensional ArrayList is:");
        for (ArrayList<Integer> row : multilist) {
            System.out.println(row);
        }

        
    }
}