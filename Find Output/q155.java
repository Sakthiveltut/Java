class Test1 { 
    int x = 10; 
public
    static void main(String[] args) 
    { 
        Test1 t1 = new Test1(); 
        System.out.println(t1.x); 
    } 
    static
    { 
        int x = 20; 
        System.out.print(x + " "); 
       // display();
    }
    void display(){
    	System.out.println("hello");
    } 
} 