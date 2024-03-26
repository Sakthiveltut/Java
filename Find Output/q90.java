class Test  
{ 
    final int MAXIMUM; 
    final double PI; 
  
public Test(int a) 
    { 
        MAXIMUM = a; 
    } 
    
  
public Test(double d) 
    { 
       PI = d;
    } 
  
public static void main(String[] args) 
    { 
        Test t1 = new Test(1500); 
        Test t2 = new Test(3.145); 
  
      //  System.out.println("MAXIMUM : " + t1.MAXIMUM + " PI : " + t2.PI); 
    } 
} 