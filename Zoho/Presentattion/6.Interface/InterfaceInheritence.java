interface Printable{  
	void method1();
    default void print(){
        System.out.println("Hello");
    }
}  
interface Showable extends Printable{  
	void method2();
    default void show(){
        System.out.println("Welcome");
    }    
}  
class InterfaceInheritence implements Showable{  
    
    public static void main(String args[]){  
        Interface1 obj = new Interface1();  
        obj.print();  
        obj.show();  
    }
	public void method1(){
		System.out.println("method2");
	}  
	
	public void method2(){
		System.out.println("method2");
	}
}  
