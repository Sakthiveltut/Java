public class MainClass{

	public static void main(String[] args)
	{
		First first = null;

		first.staticMethod();
		System.out.println(first); // null
	}
}
class First{

	static void staticMethod(){

		System.out.println("Static Method");

	}
}
