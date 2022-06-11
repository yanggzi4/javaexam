package datastructure.collections;
import java.util.*;

public class UseLinkedList {

    /*
     *
     * demonstrate how to use LinkedList that includes add,remove elements
     * use (1) for each loop, for loop (2) and (3) while loop with Iterator to retrieve and print out data
     *
     */

    public static void main(String[] args) {
        LinkedList< String> linked1= new LinkedList<>();
        linked1.add("Java");
        linked1.add("is");
        linked1.add("hardly");
        linked1.add("Typed");
        linked1.add("language");
        System.out.println(linked1);

        linked1.add(1,"program");
        System.out.println(linked1);


        for(int i=0; i< linked1.size(); i++){
            System.out.println(linked1.get(i)+"");
        }
           System.out.println();
        for(String str : linked1) {
            System.out.print(str + "");
        }
        linked1.remove(1);
        linked1.removeFirst();
        linked1.removeFirst();
        System.out.println(linked1);






    }
}
