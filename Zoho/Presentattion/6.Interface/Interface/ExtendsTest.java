class ExtendsTest implements C{
	public static void main(String[] args){
		ExtendsTest e = new ExtendsTest();
		e.method1();
	}
}
interface A{
	default void method1(){
		System.out.println("A");
	}
}
interface B{
	default void method2(){
		System.out.println("B");
	}
}
interface D{
	default void method3(){
		System.out.println("D");
	}
}
interface C extends A, B, D{
	default void method4(){
		System.out.println("C");
	}	
}
