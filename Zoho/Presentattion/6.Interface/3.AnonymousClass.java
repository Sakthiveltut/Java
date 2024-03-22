class Interface1 {  
	public static void main(String[] args){
		Son s = new Son(){};
		s.method3();
		s.method2();
		s.method1();
	}
}   
interface GrandFather{
	//void abstractMethod1();
	default void method1(){
		System.out.println("Grandfather");
	}
}
interface Father extends GrandFather{
	//void abstractMethod2();
	default void method2(){
		System.out.println("Father");
	}
}
interface Son extends Father{
	//void abstractMethod3();
	default void method3(){
		System.out.println("Son");
	}
}
