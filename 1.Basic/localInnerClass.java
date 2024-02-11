public class localInnerClass {
    public static void main(String[] args) {
        Outercls o =new Outercls();
        o.display();
    }
}

class Outercls
{
    void display()
    {
        class Inner
        {
            void innerDisplay()
            {
                System.out.println("Inner Display");
            }
        }
 
        Inner i =new Inner();
        i.innerDisplay();
    }
}
 

 