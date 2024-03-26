class Base 
{
    final public void show1() 
    {
        System.out.println("Base::show() called");
    }
    static public void show2() 
    {
        System.out.println("Base::show() called");
    }
}
class Derived extends Base 
{
    /*public void show1() 
    {
        System.out.println("Derived::show() called");
    }*/
   static public void show2() 
    {
        System.out.println("Base::show() called");
    }
}
class Main 
{
    public static void main(String[] args) 
    {
        Base b = new Derived();
        b.show1();
        b.show2();
    }
}