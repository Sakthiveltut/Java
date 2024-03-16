interface A{
    void print();
	default void method1(){
		System.out.println("A");
	}
}

class B implements A{
    @Override
    public void print() {
        System.out.println("Printing from MyClass");
    }
	void method2(){
		System.out.println("B");
	}
}

public class InterfaceUpCast {
    public static void main(String[] args) {
        A obj = new B();
        obj.print();
	obj.method1();
    }
}
