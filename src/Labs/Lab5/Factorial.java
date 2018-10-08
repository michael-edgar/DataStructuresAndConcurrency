package Lab5;

// Factorial.java
// Recursive factorial method

import java.lang.reflect.Array;

public class Factorial {

    // Recursive definition of method factorial
    public static int fact( int n )
    {
        if ( n == 1 || n == 0 )  // base case
            return 1;
        else {
            int result1 = fact(n-1);
            int result2 = n * result1;
            return result2;
            //return n * fact(n-1);
        }
    }

    public static int myPowRecursive(int x, int y)
    {
        if (y <= 0)
        {
            return 1;
        }

        else
        {
            int result1 = myPowRecursive(x, y-1);
            int result2 = x * result1;
            return result2;
        }
    }

    public static int myPowIterative(int x, int y)
    {
        int result = 1;

        if(y <= 0)
        {
            return result;
        }

        else
        {
            for(int i = 0; i < y; i++)
            {
                result = result * x;
            }

            return result;
        }
    }

    public static int smallestRecursive (int[] numbers, int n)
    {
        if (n < 2)
        {
            return numbers[0];
        }
        else
        {
            int result1 = smallestRecursive(numbers, n-1);
            if(numbers[n] < result1)
            {
                result1 = numbers[n];
            }

            return result1;
        }
    }
}
