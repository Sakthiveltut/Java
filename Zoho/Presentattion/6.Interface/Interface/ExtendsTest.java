interface A{
	default void method(){
		System.out.println("A");
	}
}
interface B{
	default void method(){
		System.out.println("B");
	}
}
interface C extends A, B{
	default void method1(){
		System.out.println("C");
	}	
}
class ExtendsTest implements C{
	public static void main(String[] args){
		ExtendsTest e = new ExtendsTest();
		e.method();
	}
}