class MultilevelInterface implements Son{

	public static void main(String[] args){
		MultilevelInterface mi = new MultilevelInterface();
		mi.method2();	
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
}
interface GrandFather{
	void abstractMethod1();
	default void method1(){
		System.out.println("Grandfather");
	}
}
interface Father extends GrandFather{
	void abstractMethod2();
	default void method2(){
		System.out.println("Father");
	}
}
interface Son extends Father{
	void abstractMethod3();
	default void method3(){
		System.out.println("Son");
	}
}
