package problems.math;
import java.util.*;
import java.util.Arrays;
public class FindMissingNumber {
        public static int
        findMissingNumbers(int[] nums)
        {
            int n=nums.length;
            int sum=((n+1)*(n+2))/2;
            for(int i=0;i<n;i++)
                sum-=nums[i];
            return sum;
        }
        public static void main(String[] args)
        {
            int[] a = { 10, 2, 1, 4, 5, 3, 7, 8, 6 };
            System.out.println(findMissingNumbers(a));
        }
    }

    /*
     *
     * the below array is supposed to have a range of number from 1 to 10
     * {10, 2, 1, 4, 5, 3, 7, 8, 6}
     * one number is missing (9 in this case)
     * write java code to find the missing number from the array
     * use a static helper method to find it
     *
     */



