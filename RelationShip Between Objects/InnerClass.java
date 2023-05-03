//  Inner Class Sample
// This is the outer class
import java.io.*;

class BankAcct 
{
    //  Balance Amount is the variable
    private double bal;
    // Initialize the balace
    BankAcct(double b)
    {
        bal = b;
    }
    // In this case, the Inner class object is created after verifying the authentication of user.
    // If r is rate of interest, this method uses rate of interest r
    void contact(double r) throws IOException
    {
        //  Accept the password from keyboard and verify
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Password: ");
        String password = br.readLine();
        if (password.equals("XYZ123"))
        {
            //  If password is correct then caslculate Interest
            Interest in = new Interest(r);
            in.calculateInterest();
        }
        else{
            System.out.println("Sorry, you are not authorized person");
            return;
        }
    }

    // inner class
    private class Interest
    {
        // rate of interest
        private double rate;
        // Initialize the rate
        Interest(double r)
        {
            rate = r;
        }
        //  calcuate Interest amount and update Balance
        void calculateInterest()
        {
            double interest = bal*rate/100;
            bal += interest;
            System.out.println("Updated Balance = "+bal);
        }
    }
}
// Using Inner Class
class InnerClass {
    public static void main(String args[]) throws IOException
    {
        // Bank account is holding a balance of 10000
        BankAcct acct = new BankAcct(10000);
        // Update Bank balance by adding balance by 9.5%
        acct.contact(9.5);
    }
}
