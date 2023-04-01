//  Factorial without Recursion

class NoRecursion {
    static long factorinal(int num)
    {
        long fact =1;
        while(num>0)
            fact *=num--;
        return fact;
    }
    public static void main(String args[])
    {
        System.out.println("Factoril of 5: ");
        System.out.println(NoRecursion.factorinal(5));
    }
}
