class Main implements A{
	public static void main(String[] args){
		
	Main m = new Main();
	//m.method1();
	m.method2();
	}
	void method2(){
		A.super.method1();
		System.out.println(a);	
	}
}
interface A{
	String a = "A";
	default void method1(){
		System.out.println("method1");
	}
}
