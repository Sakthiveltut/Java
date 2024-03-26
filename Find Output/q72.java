public class Juggler extends Thread  
{ 
    public static void main(String[] args)  
    { 
        try 
        { 
            Thread t = new Thread(new Juggler()); 
            Thread t2 = new Thread(new Juggler()); 
            //t.start();
        } 
        catch (Exception e)  
        { 
            System.out.print("e "); 
        } 
    } 
    public void run()  
    { 
        for (int i = 0; i < 2; i++)  
        { 
            try 
            { 
                Thread.sleep(500); 
            } 
            catch (Exception e)  
            { 
                System.out.print("e2 "); 
            } 
            System.out.print(Thread.currentThread().getName()+ " "); 
        } 
    } 
} 