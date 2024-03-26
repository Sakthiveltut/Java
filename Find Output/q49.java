public class Test
{
    try
    {
        public Test()
        {
            System.out.println("GeeksforGeeks");
            throw new Exception();
        }
    }
    catch(Exception e)
    {
        System.out.println("GFG");
    }
    public static void main(String[] args)
    {
        Test test = new Test();
    }
}