public class Test 
{ 
    public static void main(String[] args) 
    { 
        byte var = 1; 
        //var = (byte) (var * 0)
        var = (byte) var * 0; //line 1 
        byte data = (byte) (var * 0); //line 2 
        System.out.println(var);         
    } 
} 