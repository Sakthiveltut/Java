class Main implements C{
	
	public static void main(String[] args){
		Main m = new Main();
		m.hello();		
	}
}
interface A {
    default void hello() {
        System.out.println("Hello from A");
    }
}

interface B {
    default void hello() {
        System.out.println("Hello from B");
    }
}

interface C extends A, B {
   @Override
    default void hello() {
        A.super.hello(); 
        B.super.hello(); 
    }
}