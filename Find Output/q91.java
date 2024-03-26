class Test  
{ 
   // final int MAXIMUM; 
    final int MAXIMUM = m1(); 
   // final static int MAXIMUM = m1(); 
  
private int m1() 
    { 
        System.out.println(MAXIMUM); 
        return 1500; 
    } 
  
public static void main(String[] args) 
    { 
        Test t = new Test(); 
  
        System.out.println(t.MAXIMUM); 
    } 
} 