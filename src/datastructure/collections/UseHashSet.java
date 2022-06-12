package datastructure.collections;
import java.io.*;
import java.util.*;
public class UseHashSet {

    /*
     *
     * demonstrate how to use HashSet that includes add,remove elements
     * add these elements to your collections: 3,3,4,1,7,1,0,7,4,5,0,9,8
     * use for each loop to print out data
     * print out the number of the elements of your HashSet
     *
     */

    public static void main(String[] args) {
        HashSet<ArrayList> set = new HashSet<>();
        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(3);
        list1.add(3);
        list1.add(4);
        list1.add(1);
        list1.add(7);
        list1.add(1);
        list1.add(0);
        list1.add(7);
        list1.add(4);
        list1.add(5);
        list1.add(0);
        list1.add(9);
        list1.add(8);

        Iterator itr = list1.iterator();

        for (Integer i : list1) {
            System.out.print(i + ", ");
        }
        System.out.println();




        //write your code here

    }
}
