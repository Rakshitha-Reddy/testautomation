package javaclasses;

public class ConstructorsDemo {
    public ConstructorsDemo()
    {
        System.out.println("NO Arg Constructor");

    }
    public ConstructorsDemo(String name)
    {
        this();
        System.out.println("Arg Constructor");
    }
    public static void main(String[] args)
    {
        ConstructorsDemo constructorsDemo = new ConstructorsDemo("Java");
    }
}
