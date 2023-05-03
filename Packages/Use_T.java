import pack.Addition;
import pack.Subtraction;

class Use_T {
    public static void main(String args[])
    {
        //  Create Addition Class Object
        Addition obj = new Addition(10,15.5);

        //  Call the sum method;
        obj.sum();

        //  Call the sub method and pass values;
        double res = Subtraction.sub(10,15.5);

        System.out.println("Sub = "+ res);
    }
}
