public class Base 
{ 
    public int multiplier(int data) 
    { 
        return data*5; 
    } 
} 
  
class Derived extends Base 
{ 
    private static int data; 
    public Derived() 
    { 
        data = 25; 
    } 
    public static void main(String[] args) 
    { 
        Base temp = new Derived(); 
        System.out.println(temp.multiplier(data)); 
    } 
} 