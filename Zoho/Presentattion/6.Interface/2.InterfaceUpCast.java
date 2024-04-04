public class InterfaceUpCast {
    public static void main(String[] args) {
        A obj = new B();
		B obj1 = (B)obj; 
		System.out.println(obj1);
        obj.print();
		obj.method1();
	//obj.method2(); //illegal static interface method call
	//A a =new A();  //cannot be instantiated
    }
}
interface A{
    void print();
	default void method1(){
		System.out.println("A method1");
	}
	static void method2(){
		System.out.println("A method2");
	}
}
class B implements A{
    @Override
    public void print() {
        System.out.println("Printing from MyClass");
    }
	@Override 
	public void method1(){
		System.out.println("B");
	}
}