import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/** 
 * Accepting a single character from KeyBoard
class Accept {
    public static void main(String args[]) throws IOException{
        // create BufferReader object to accept data from the KeyBoard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // ask for char and read it 
        System.out.print("Enter a character: ");
        char ch = (char)br.read();

        // display the character
        System.out.print("You Entered: "+ch);
    }
}
*/

/** 
// Accepting a String from KeyBoard
class Accept
{
    public static void main(String args[]) throws IOException 
    {
        // create a BufferReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Take the Inpur
        System.out.print("What's your name: ");
        // read the Input
        String name = br.readLine();

        //print the Input
        System.out.print("Your name is: "+ name);
    }
}
*/

//Accepting an Integer Value from the KeyBoard
class Accept
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        int n = Integer.parseInt(br.readLine());
        System.out.print("Entered number is: "+n);
    }
}
