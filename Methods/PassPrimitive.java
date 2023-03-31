class check {
    void swap(int num1, int num2) {
        int temp; //temporary variable
        System.out.println("Before swap: "+num1 +"\t"+num2);
        temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swap: "+num1 +"\t"+num2);
    }
}

class PassPrimitive {
    public static void main(String args[])
    {
        check obj = new check();
        int num1 = 10;
        int num2 = 15;
        System.out.println(num1 +"\t"+num2);
        obj.swap(num1, num2);
        System.out.println(num1 +"\t"+num2);
    }
}
