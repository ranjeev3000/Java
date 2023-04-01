// Creating our own factory Methods
import java.io.*;

//  an interface with an abstract method
interface Fees
{
    double showFees(); // this method does not have body
}

//  implementation class to implement showFees method
class CSE implements Fees
{
    public double showFees()
    {
        return 60000;
    }
}

//  another implementation class to implement showFees
class ECE implements Fees{
    public double showFees()
    {
        return 70000;
    }
}

//  Factory class with a factory method getFees()
class courseFees
{
    public static Fees getFees(String course)
    {
        if(course.equalsIgnoreCase("CSE"))
        {
            return new CSE();
        }
        else if(course.equalsIgnoreCase("ECE"))
        {
            return new ECE();
        }
        else return null;
    }
}

/*Using the factory method getFees() to display any course Fees depending on User option */
class MyClass {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Course Name: ");
        String name = br.readLine();
        Fees f = courseFees.getFees(name);
        System.out.println("Name: "+name);
        System.out.println("Factory method class: "+f);
        System.out.println("Fees: "+f.showFees());
    }
}
