import java.io.*;

class Fibo {
    public static void main(String args[]) throws IOException
    {
        // Accept input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number of sequence: ");
        String st = br.readLine();
        int n = Integer.parseInt(st);

        //  Define element for fibonacci series
        int f1,f2,f;
        f1 = 0;
        f2 = 1;

        f = f1+f2;
        int count = 3;

        // Print first 3 elements of series;
        System.out.print(f1 + " ");
        System.out.print(f2 + " ");
        System.out.print(f+" ");

        while(count<n)
        {
            f1 = f2;
            f2 = f;
            f = f1+f2;
            System.out.print(f+" ");

            count++;
        }

    }
}
