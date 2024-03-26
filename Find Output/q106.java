import java.util.*; 
  
public class Test { 
public static void main(String args[]) 
    { 
        String s1 = "java"; 
        String s2 = "java"; 
        String s3 = new String("java");
        System.out.println(s1.equals(s2)); 
        System.out.println(s1 == s2); 
        
        System.out.println(s3.equals(s2)); 
        System.out.println(s3 == s2); 
    } 
} 