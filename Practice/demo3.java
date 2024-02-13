package Practice;

public class demo3 {
    public static void main(String[] args){
        System.out.println("hello");

        overloadMethod(1, 00);
    }
    static void overloadMethod(byte a,byte b){
        System.out.println(a*b);
    }
    static void overloadMethod(int a,int b){
        System.out.println(a+b);
    }    
}
