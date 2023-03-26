import java.io.*;
import java.util.StringTokenizer;
import java.io.*;

class Different {
    public static void main(String args[]) throws IOException
    {
        // To accept data from keybloard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Ask for Input, seperated by commas
        System.out.print("Enter,name, age, salary: ");

        // Accept input into a string
        String str = br.readLine();

        // Use StringTokenizer to split inputs in commas
        StringTokenizer st = new StringTokenizer(str, ",");

        // Recieve tokens from string
        String s1 = st.nextToken();
        String s2 = st.nextToken();
        String s3 = st.nextToken();

        // Trim any space before and after the token
        s1 = s1.trim();
        s2 = s2.trim();
        s3 = s3.trim();

        // Convert s1 into String s2 into int and s3 into Float
        String name = s1;
        int age = Integer.parseInt(s2);
        Float salary = Float.parseFloat(s3);

        //display the entered result
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);


    }
}
