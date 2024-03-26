public class Test extends Thread
{
    public void run()
    {
        System.out.printf("Test ");
    }
    public static void main(String[] args)
    {
        Test test = new Test();
        test.run();
        test.start();
    }
}