package problems.math;

public class FindLowestDifference {
    import java.util.*;


    static int findLowestDifference(int A[], int B[],
                                      int m, int n)
    {
        Arrays.sort(A);
        Arrays.sort(B);

        int a = 0, b = 0;
        int result = Integer.MAX_VALUE;
        while (a < m && b < n)
        {
            if (Math.abs(A[a] - B[b]) < result)
                result = Math.abs(A[a] - B[b]);

            if (A[a] < B[b])
                a++;

            else
                b++;

        return result;
    }
   public static void main(String[] args) {
       int A[] = {30, 12, 5, 9, 2, 20, 33, 1};

       int B[] = {18, 25, 41, 47, 17, 36, 14, 19};

       int m = A.length;
       int n = B.length;

       System.out.println(findLowestDifference(A, B, m, n));
   }

      //  int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        //int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

    }
}
