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
        str += " "; // add a space at the end of the string

        String[] words = new String[50];

        int length = 0; // to keep track of the length of the words

        String word = "";

        String largestWord = "";

        for (int i = 0; i < str.length(); i++) {

            // Split the string into words

            if (str.charAt(i) != ' ') {

                word = word + str.charAt(i);

            } else {

                //Add word to the array

                words[length] = word;

                length++; //

                // set the word to an empty string

                word = "";

            }

        }

        int lengthOfLargestWord = 0;

        largestWord = words[0]; // set the largest word to start as the first element in the words array

        for (int j = 0; j < length; j++) {

            if (largestWord.length() < words[j].length())

                largestWord = words[j];

            lengthOfLargestWord = largestWord.length();

        }

        System.out.println("Length of the longest word: " + lengthOfLargestWord);

        System.out.println("Largest word: " + largestWord);

    }


        //write your code here



}
