class Super
{
    public void display()
    {
        System.out.println("I am Super Display");
    }
    final void finalDisplay()
    {
        System.out.println("I am Super Final Display");
    }
}
class sub extends Super
{
    public void display()
    {
        System.out.println("I am Sub Display");
    }
}
 
public class finalMethods {
    public static void main(String args[])
    {
        sub o =new sub();
        o.display();
        o.finalDisplay();
    }
}