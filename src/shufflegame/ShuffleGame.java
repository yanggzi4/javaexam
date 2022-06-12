package shufflegame;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;

public class ShuffleGame implements GameRoadMap {

    Scanner scanner = new Scanner(System.in);

    int[] array = {1, 0, 1};

    /**
     * method that takes an array shuffles the components in random way and returns it
     *
     * @param array: array to shuffle
     * @return array: shuffled array
     */
    public int[] shuffleGame(int[] array) {
        Random rnd = ThreadLocalRandom.current();
        for (int i = array.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            int a = array[index];
            array[index] = array[i];
            array[i] = a;
        }
        return array;
    }

    /**
     * captures the user input (1, 2 or 3) saves it in an integer variable and returns it
     *
     * @return playerGuess: userInput value
     */
    public int playerGuess() {
        List<Integer> arrayList = Arrays.asList(1, 0, 1);
        String userChoice = scanner.nextLine();
        return playerGuess();
    }

    /**
     * checks whether the player guess position is in a correct position in the shuffled array or not
     * and prints the corresponding statements
     *
     * @param shuffledArray: takes the shuffled array
     * @param playerGuess:   takes the chosen position user input
     */
    public void checkGuess() {
        List<Integer> arrayList = Arrays.asList(1, 0, 1);
        String userChoice = scanner.nextLine();
        int position = 0;
        boolean flag = true;
        if (userChoice.equals("y")) {
            while (flag) {
                Collections.shuffle(arrayList);
                System.out.println("Pick the position: either 1,2,3");
                int num = scanner.nextInt();
                for (int i = 0; i <= arrayList.size(); i++) {
                    position = arrayList.indexOf(0);
                }
                if (position + 1 == num) {
                    System.out.println("Good guess");
                    flag = false;
                } else {
                    System.out.println("Sorry!!! wrong guess");

                }

                /**
                 * uses the previous functions in a good sequential way to run the game
                 * uses the method recursion in order to loop in the game
                 */
                public void play() {
                    System.out.println("Do you want to try again? y / n");

                    String userContinue = scanner.nextLine();

                    if (userContinue.equals("y")) {

                        System.out.println("See you next time");

                    }else{
                        System.out.println("See you next time");
                    }
                }
            }


        }
    }
}