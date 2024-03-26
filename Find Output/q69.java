class A 
{ 

   // public A()  
     public A(String a)
    { 
        System.out.print("A"); 
    } 
} 
  
public class B extends A  
{ 
    public B(String s)  
    { 
        System.out.print("B"); 
    } 
    public static void main(String[] args)  
    { 
        new B("C"); 
        System.out.println(" "); 
    } 
} 