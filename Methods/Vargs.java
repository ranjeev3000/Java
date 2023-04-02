class Vargs {

    // This is a varargs method, it can accept arbitrary number of arguments
    static int max(int ... x)
    {
        //  Take the first number in the array as biggest
        int max = x[0];
        //  Compare the biggest number with other number and assign the max values to variable if othe number is maximum
        for(int i=0; i<x.length;i++)
        {
            if(max<x[i]) max = x[i];
        }

        return max;   
    }

    public static void main(String args[])
    {
        // pass an array of 5 elements to varArgs method
        int[] arr1 = {20,10,5,35,40};
        int result = max(arr1);
        System.out.println("Maximum number of arr1 is: "+result);
        // Pass an array of 3 elements to varArgs method
        int[] arr2 = {1,2,4};
        result = max(arr2);
        System.out.println("Maximum number of arr2 is: "+result);
        // Pass 2 individual elements
        result = max(10,30,53,23,4,56,1);
        System.out.print("Maximum: "+result);

    }
}
