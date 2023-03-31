class Person {
    // Instance variables
    private String name;
    private int age;

    // mutator methods to store the data
    public void setName(String name) 
    {
        this.name = name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    // Accessor methods to read data
    public String getname ()
    
    {
        return name;
    }
    public int getAge()
    {
        return age;
    }
}



class Methods {
    public static void main(String args[])
    {
        Person p1 = new Person();
        p1.setName("Raju");
        p1.setAge(22);
        String name = p1.getname();
        int age1 = p1.getAge();
        System.out.println(name + " is "+ age1 +" years old");
    }
}
