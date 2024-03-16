class A{
	void method(){
		System.out.println("A");
	}
}
class B{
	void method(){
		System.out.println("B");
	}
}
class C extends A, B{
	void method(){
		System.out.println("C");
	}
}
class ExtendsTest implements C{

	public static void main(String[] args){
		ExtendsTest e = new ExtendsTest();
		e.method();
	}
}

