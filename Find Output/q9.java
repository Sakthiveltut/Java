public class Main 
{ 
	//static Object o1 = new Object();
	public static void gfg(Object o) 
    { 
        System.out.println("Object"); 
    } 
    public static void gfg(String s) 
    {     
        System.out.println("String"); 
    } 

  
    public static void main(String args[]) 
    { 
        gfg(null);
	//System.out.println(o1);
    } 
} 
