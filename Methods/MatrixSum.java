// Matrix addition and Subtraction
// Passing Arrays to Methods and zReturning them
import java.io.*;
import java.util.*;
class Matrix 
{
    // take a 2D Array for Matrix and rows, cols
    int arr[][];
    int r,c;
    // Intialize r,c and allot memory for array
    Matrix(int r, int c)
    {
        this.r = r;
        this.c = c;
        arr = new int[r][c];
    }
    //  accept 2D array from keyBoard and return it
    int[][] getMatrix() throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer is useful to accept each row as a single string
        //  and divide it into tokens, Each token represents an array element.
        StringTokenizer st;

        for(int i = 0; i<r; i++)
        {
            String s = br.readLine();
            st = new StringTokenizer(s," ");
            for(int j=0; j<c; j++)
            {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        return arr;
    }

    // accept two 2-D arrays and find sum matrix and then retuen it
    int[][] findSum(int a[][], int b[][])
    {
        int temp[][] = new int[r][c];

        for(int i=0; i<r; i++)
        {
            for(int j=0; j<c;j++)
            {
                temp[i][j] = a[i][j] + b[i][j];
            }
        }
        return temp;
    }

    // Display the resultant 2D array as a matrix
    void displayMatrix(int res[][])
    {
        for(int i=0; i<r;i++)
        {
            for(int j = 0; j<c; j++)
            {
                System.out.print(res[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

class MatrixSum {
    public static void main(String args[]) throws IOException
    {
        //  Create 2 objects to Matrix class, since each object contains an array
        Matrix obj1 = new Matrix(3, 3);
        Matrix obj2 = new Matrix(3, 3);

        // Take 3 references for 2 D array
        int x[][], y[][], z[][], k[][];
        System.out.println("\nEnter elements for first matrix: ");
        x = obj1.getMatrix();

        System.out.println("\nEnter elements for second Matrix: ");
        y = obj2.getMatrix();
        //  add the matrices and return the sum in z
        z = obj1.findSum(x,y);
        k = obj2.findSum(x, y);

        System.out.println("Dis[play the sum of matrix: ");
        obj2.displayMatrix(z);

    }
}
