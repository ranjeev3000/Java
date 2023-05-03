// Relating objects of three classes.
class One
{
    // onj2 is class Two's Reference
    Two obj2;
    // initialise obj2
    One(Two obj2)
    {
        this.obj2 = obj2;
    }
    double cube(double x)
    {
        // Call class Two's method using obj2
        double result = x*obj2.square(x);
        return result;
    }
}

class Two
{
    // obj3 is class Three's Reference
    Three obj3;
    // initialise obj3
    Two(Three obj3)
    {
        this.obj3 = obj3;
    }

    double square(double x)
    {
        // call class Three's methods using obj3
        double result = x*obj3.get(x);
        return result;
    }
}

class Three
{
    double get(double x)
    {
        return x;
    }
}


class Relate_Reference {
    public static void main(String args[])
    {
        //  Create class Three's object obj3
        Three obj3 = new Three();
        //  Create class Two's object obj2 and pass obj3
        Two obj2 = new Two(obj3);
        //  Create class One's onbject and pass obj1
        One obj1 = new One(obj2);
        
        //  call cube method of class One
        double result1 = obj1.cube(5);
        System.out.println("Cube of 5 = "+result1);
        //  call square method of class two
        double result2 = obj2.square(6);
        System.out.println("Square of 6 = "+result2);
    }

}
