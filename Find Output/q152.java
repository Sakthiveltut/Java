class Test { 
    void Div() throws ArithmeticException 
    { 
        int a = 25, b = 0, rs; 
        rs = a / b; 
        System.out.print("\n\tThe result is : " + rs); 
        System.out.print("hello"); 
    } 
public
    static void main(String[] args) 
    { 
        Test t = new Test(); 
        try { 
            t.Div(); 
        } 
        catch (ArithmeticException e) { 
            System.out.print("\n\tError : " + e.getMessage()); 
        } 
        System.out.print("\n\tBYE GEEKS"); 
    } 
} 