class Main implements C{
	public static void main(String[] args){
		Main m = new Main();
		m.hello();
	
	}
}
interface A {
	String a = "A";
    default void hello() {
        System.out.println("Hello from A");
    }
}

interface B {
	String b = "B";
    default void hello() {
        System.out.println("Hello from B");
    }
}

interface C extends A, B {
   @Override
    default void hello() {
	String a = "C";
        A.super.hello(); 
        B.super.hello(); 
	
	System.out.println(b);
    }
}
