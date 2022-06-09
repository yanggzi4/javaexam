package problems.math;

public class Factorial {
    static int factorial(int n)
    {
        if (n == 0)
            return 1;

        return n*factorial(n-1);
    }


    public static void main(String[] args) {
        int num = 6;
        System.out.println("Factorial of " + num + " is" + factorial(6));
    }

        //run your code here


    }

