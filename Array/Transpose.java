import java.util.Scanner;

class Transpose {
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        //Take number of rows and columns
        System.out.println("Enter number of rows and Columns in matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();

        //  Define array
        int arr[][] = new int[r][c];

        // Take matrix value from users
        System.out.println("Assign values to the matrix");
        for (int i=0;i<r;i++)
        for(int j=0; j<c; j++)
        arr[i][j]= sc.nextInt();

        System.out.println("Transpose Matrix is");
        for(int i=0;i<c;i++) {
            for (int j=0;j<r;j++)
            {
                System.out.print(arr[j][i]+"\t");
            }
            System.out.println("");
        }
    }
}
