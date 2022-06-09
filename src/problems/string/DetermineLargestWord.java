package problems.string;
import java.util.*;
public class DetermineLargestWord {


    /*
     *
     * implement a code to find the length and longest word in the given sentence
     * should return "10" (for length), "biological" (longest word)
     *
     */

    public static void main(String[] args) {

        String str = "Human brain is a biological learning machine";
          String [] word= str.split("");
          String largestWord= "";
        for(int i = 0; i < word.length; i++){
            if(word[i].length() >= largestWord.length()){
                largestWord = word[i];
            }
            System.out.print(largestWord);
        }



        //write your code here

    }

}
