interface Parent{
	void abstractMethod1();
	default void method1(){
		System.out.println("Grandfather");
	}
}
interface Daughter extends Parent{
	void abstractMethod2();
	default void method2(){
		System.out.println("Father");
	}
}
interface Son extends Parent{
	void abstractMethod3();
	default void method3(){
		System.out.println("Son");
	}
}
class HierarchicalInterface implements Son{

	public static void main(String[] args){
		HierarchicalInterface hi = new HierarchicalInterface();
		hi.method3();	
	}
	@Override
	public void abstractMethod1(){
		System.out.println("abstractMethod1");
	}
	//@Override
	public void abstractMethod2(){
		System.out.println("abstractMethod1");
	}
	@Override
	public void abstractMethod3(){
		System.out.println("abstractMethod2");
	}
}