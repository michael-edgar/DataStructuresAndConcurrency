package Lab5;

public class Main {
    public static void main(String args[])
    {
        int n = Factorial.fact(5);
        System.out.println("5! is " +n);

        int x = 6;
        int y = 2;
        n = Factorial.myPowRecursive(x,y);
        System.out.println(x+" to the power of " +y+ " is " + n);

        n = Factorial.myPowIterative(x,y);
        System.out.println(x+" to the power of " +y+ " is " + n);

        int[] a = {5,32,65,1,667};
        n = Factorial.smallestRecursive(a,(a.length-1));
        System.out.println("The smallest element is " +n);
    }
}
