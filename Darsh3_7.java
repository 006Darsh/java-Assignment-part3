interface TestInterface
{
    // abstract method
    public void square(int a);
  
    // default method
    default void show()
    {
      System.out.println("Default Method Executed");
      System.out.println("This code is prepared by 21CE006 Aswani Darsh");
    }
}
  
class TestClass implements TestInterface
{
    // implementation of square abstract method
    public void square(int a)
    {
        System.out.println(a*a);
    }
}
public class Darsh3_7{
    public static void main(String args[])
    {
        TestClass d = new TestClass();
        d.square(4);
  
        // default method executed
        d.show();
    }
}