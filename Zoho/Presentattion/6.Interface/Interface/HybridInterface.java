interface A{
	void abstractMethod1();
	default void method1(){
		System.out.println("A");
	}
}
interface B extends A{
	void abstractMethod2();
	default void method2(){
		System.out.println("B");
	}
}
interface C extends A{
	void abstractMethod3();
	default void method3(){
		System.out.println("C");
	}
}
interface D extends B, C{
	void abstractMethod4();
	default void method4(){
		System.out.println("D");
	}
}
class HybridInterface implements D{

	public static void main(String[] args){
		HybridInterface hi = new HybridInterface();
		hi.method3();
		hi.abstractMethod3();
	}
	@Override
	public void abstractMethod1(){
		System.out.println("abstractMethod1");
	}
	@Override
	public void abstractMethod2(){
		System.out.println("abstractMethod1");
	}
	@Override
	public void abstractMethod3(){
		System.out.println("abstractMethod2");
	}
	@Override
	public void abstractMethod4(){
		System.out.println("abstractMethod2");
	}
}