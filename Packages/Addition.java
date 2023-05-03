// STEP1: Create a Package pack with Addition class
package pack;

public class Addition {
    // Instane vars
    private double d1, d2;
    public Addition(double a, double b)
    {
        d1 = a;
        d2 = b;
    }

    //  Method to find sum of two numbers
    public void sum()
    {
        System.out.println("Sum = "+(d1+d2));
    }
}
