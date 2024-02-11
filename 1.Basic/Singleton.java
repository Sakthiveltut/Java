class ABC
{
    static ABC obj =null;
    private ABC(){}
    public static ABC getInstance()
    {
        if(obj==null)
            obj=new ABC();
        return obj;
    }
    void display()
    {
        System.out.println("I am Display");
    }
}
 
public class Singleton {
    public static void main(String[] args) {
        ABC o=ABC.getInstance();
        o.display();
    }
}