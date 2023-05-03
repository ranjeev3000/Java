// Relating class Two with class One
class One 
{
    // Declare instance variable
    int x;
    Two t; // Class Two's Reference

    One(Two t)
    {
        // Copy Two's reference into t
        this.t = t;
        this.x = 10;
    }

    void display()
    {
        System.out.println("One's x = "+x);
        System.out.println("Two's reference = "+t);
        // Call class Two's methods
        t.display();
        // Access class Two's var
        System.out.println("Two's var= "+x);
    }

}

class Two
{
    // Instance variables
    int y;

    Two(int y)
    {
        this.y = y;
    }
    // methods to display y
    void display()
    {
        System.out.println("Two's y = "+y);
    }
}

class Relate_Ref {
    public static void main(String args[])
    {
        // Create class Two object and store 22 there
        Two obj2 = new Two(22);
        //  Create class one objectr and pass class Two object in it.
        One obj1 = new One(obj2);
        obj1.display();
    }
}
