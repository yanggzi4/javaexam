package problems.math;

public class Pattern {
    /*
     *
     * read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
     * 100,99,98,97,96,95,94,93,92,91,90,
     * 88,86,84,82,80,78,76,74,72,70,
     * 67,64,61,58,55,52,49,46,43,40,
     * 36,32,28,24,20,16,12,8,4,09
     *
     */

    public static void main(String[] args) {
        for(int i = 100; i >= 90; i--)
        {
            System.out.print(i+ ",");
        }



        int n = 70;

        for (int i = 88; i >= n; i--) {
            if (i % 2 == 0) {
                System.out.print(i + ",");
            }
        }
        //write your code here
        for(int i = 67; i >=40; i--)
        {
            System.out.print(i+ ",");
        }
    }
}
