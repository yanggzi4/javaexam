package datastructure.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.io.*;
import java.util.*;

public class UseCollections {

    /*
     *
     * given 2 arrays, array1 and array2
     *
     *
     * use collections (List and Set to solve this exercise)
     *
     * 1. find union of the two arrays. output: [0, 1, 2, 3, 4, 5, 7, 8, 9]
     * 2. find the intersection of the two arrays. output: [0, 1, 3, 4]
     * 3. find the symmetric difference of the two arrays. output: [2, 5, 7, 8, 9]
     *
     */
    public static ArrayList<Integer>
    Unionarray(int array1[], int array2[],
               int n, int m) {
        TreeSet<Integer> set = new TreeSet<>();


        for (int i : array1)
            set.add(i);
        for (int i : array2)
            set.add(i);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : set)
            list.add(i);
        return list;
    }
    static void printIntersection(int array1[], int array2[])
    {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs1 = new HashSet<>();

        for (int i = 0; i < array1.length; i++)
            hs.add(array1[i]);

        for (int i = 0; i < array2.length; i++)
            if (hs.contains(array2[i]))
                System.out.print(array2[i] + " ");
    }




    public static void main(String[] args) {
        int[] array1 = {1, 3, 2, 4, 8, 9, 0};
        int[] array2 = {1, 3, 7, 5, 4, 0, 7, 5};
        int n = array1.length;
        int m = array2.length;

        ArrayList<Integer> uni = Unionarray(array1, array2, n, m);
        for (int i : uni) {
            System.out.print(i + " ");
        }
        System.out.println();
        printIntersection(array1 , array2);
        System.out.println();

    }

}




