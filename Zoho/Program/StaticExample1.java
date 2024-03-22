public class StaticExample1 {

	public final static StaticExample1 obj1=new StaticExample1();

    public static void main(String[] args) {
        StaticExample1 obj = new StaticExample1();
	
	System.out.println(obj1); //variable obj1 might not have been initialized
	obj.method();
    }
	  public void method() {
        	obj1.method1();
    }
	public void method1() {
        	System.out.println("static method");
    }
}
