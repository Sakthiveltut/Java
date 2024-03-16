interface Father{
	void abstractMethod1();
	default void method1(){
		System.out.println("Father");
	}
}

interface Son extends Father{
	void abstractMethod2();
	default void method2(){
		System.out.println("Son");
	}
}

class SingleInterface implements Son{

	public static void main(String[] args){
		SingleInterface si = new SingleInterface();
		si.method2();	

	}
	@Override
	public void abstractMethod1(){
		System.out.println("abstractMethod1");
	}
	@Override
	public void abstractMethod2(){
		System.out.println("abstractMethod2");
	}
}