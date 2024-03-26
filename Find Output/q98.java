interface GFG 
{ 
    void myMethod(); 
    void getInfo(); 
} 
  
abstract class Geeks implements GFG 
{ 
    void getData() 
    { 
        System.out.println("GFG"); 
    } 
} 
  
public class Test extends Geeks 
{ 
    public void myMethod() 
    { 
        System.out.println("GeeksforGeeks"); 
    } 
    public void getInfo() 
    { 
        System.out.println("Geeks"); 
    } 
      
    public static void main(String[] args) 
    { 
        Geeks obj = new Test(); 
        obj.getInfo(); 
    } 
} 