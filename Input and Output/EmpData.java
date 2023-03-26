import java.io.*;

// Employee Details

class EmpData {
    public static void main(String args[]) throws IOException
    {
        // Create BufferReader object to store data
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        // Accept Employee Details
        System.out.print("Enter Id: ");
        int id = Integer.parseInt(br.readLine());

        System.out.print("Enter Sex: ");
        char sex = (char)br.read();

        //skip 2 charchters
        br.skip(2);

        System.out.println("Enter Name: ");
        String name = br.readLine();

        // Display the Employee details
        System.out.println("Id: "+id);
        System.out.println("Sex: "+sex);
        System.out.println("Name: "+name);
    }    
}
