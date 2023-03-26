import java.io.*;

class Sort {
    public static void main(String args[]) throws IOException, ArrayIndexOutOfBoundsException
    {
        //  To accept the data from BufferReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Create an int type array
        System.out.print("How many Elements: ");
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];

        // Passing data to arr
        for (int i = 0;i<n; i++)
        {
            System.out.print("Enter Int: ");
            arr[i] = Integer.parseInt(br.readLine());
        }

        //  use Bubble sort technique to sort the Integer
        int limit = n-1;
        boolean flag = false;
        int temp;
        for(int i=0; i<n;i++) 
        {System.out.println(arr[i]);
        }
        for(int i=0; i<limit; i++)
        {
            for (int j = 0; j<limit-i; j++)
            {
                //  if first element is bigger than second one than swap
                if(arr[j]> arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }
            }
            if(flag=false) break;
            else flag = false;
        }

        // display the sorted array
        System.out.println("The sorted array is: ");
        for(int i=0; i<n;i++) 
        {System.out.println(arr[i]);
        }
    }
}
