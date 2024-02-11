class staticTest
{
    static int a=10;
    int b=20;
    void show()
    {
        System.out.println("A : "+a+" B : "+b);
    }
    static void display()
    {
        System.out.println("A : "+a);
    }
}
public class staticMembers {
    public static void main(String args[])
    {
        staticTest o1=new staticTest();
        o1.show();
        staticTest o2=new staticTest();
        o2.b=100;
        staticTest.a=200;
        o2.show();
        o1.show();
    }
}
 