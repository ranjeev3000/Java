import java.io.*;

class Leap {
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //  Take Year input from user
        System.out.println(" Enter year ");

        int year = Integer.parseInt(br.readLine());

        if (year%100 == 0 && year%400==0) System.out.println("It's a leap year");
        else if (year%100!=0 && year%4==0) System.out.println("It's a leap year");
        else System.out.println("Not a leap year");
    }
}
