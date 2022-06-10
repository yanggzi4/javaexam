package datastructure.collections;
import java.util.ArrayList;

public class UseArrayList {

    /*
     *
     * demonstrate how to use ArrayList that includes add,remove elements
     * use (1) for each loop, for loop (2) and (3) while loop with Iterator to retrieve and print out data
     *
     */

    public static void main(String[] args) {
        ArrayList<String> cars= new ArrayList<String>();
        cars.add("BMW");
        cars.add("Lexus");
        cars.add("Mercedes");
        cars.add("Audi");
        cars.add("Toyota");
        System.out.println(cars);

        cars.get(1);
        cars.remove(0);
        cars.size();
        for(int i=0;i<cars.size();i++){
            System.out.println(cars.get(i));
        }
        for(String i: cars){
            System.out.println(i);
        }



        //write your code here

    }
}
