class AnonymousClass  {  
	public static void main(String[] args){
		Son s = new Son(){};
		//s.method3();
		//s.method2();
		//s.method1();
		Father f = new Father(){};
		f.method();
	}
}   
interface GrandFather{
	//void abstractMethod1();
	default void method1(){
		System.out.println("Grandfather");
	}
	static void method(){
		System.out.println("Grandfather");
	}
}
interface Father{
	//void abstractMethod2();
	default void method2(){
		System.out.println("Father");
	}
	static void method(){
		System.out.println("Father");
	}
}
interface Son extends Father{
	//void abstractMethod3();
	default void method3(){
		System.out.println("Son");
	}
}
