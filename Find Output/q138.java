class MainClass { 
public
    static void main(String[] args) 
    { 
        int x = 10; 
       //final int y = 20; //no error
       int y = 20; //error
        switch (x) { 
        case 10: 
            System.out.println("HELLO"); 
            break; 
        case y: 
            System.out.println("GEEKS"); 
            break; 
        } 
    } 
} 