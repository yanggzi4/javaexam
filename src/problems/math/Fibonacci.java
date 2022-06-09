package problems.math;

public class Fibonacci {
    public static void main(String[] args) {

            int maxNumber = 30;
            int previousNumber = 0;
            int nextNumber = 1;
            System.out.print("Fibonacci Series of "+maxNumber+" numbers:");

            int i=1;
            while(i <= maxNumber)
            {
                System.out.print(previousNumber+" ");
                int sum = previousNumber + nextNumber;
                previousNumber = nextNumber;
                nextNumber = sum;
                i++;
            }

        }


        //run your code here


    }
