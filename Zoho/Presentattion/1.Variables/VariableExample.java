public class VariableExample
{
	public static int staticVar = 10;	//static variable
	private int instanceVar = 20; 		//instance variable 	    
	int a = 10, b = 200;
	static int integerVar;
	static String stringVar;
	static char charVar;
	int var1;
	
	//main method
	public static void main(String... args)
	{
		//final int localVar = 30;	//local variable
		VariableExample object = new VariableExample();
		int a = 20;
		int localVar;

		/*System.out.println("Java Variables");
		System.out.println("Local Variable "+ localVar);
		System.out.println("Instance Variable "+ object.instanceVar);
		System.out.println("Static Variable "+ staticVar);
		System.out.println("Static Variable "+ VariableExample.staticVar);
		System.out.println("Static Variable "+ VariableExample.staticVar);*/
		//System.out.println(b);

		//object.accessVariable();
		//accessVariable();

		//System.out.println(object.var1);
		//System.out.println(i);
		//System.out.println(localVar);
		
		staticVar = 10;
	}

	/*public void accessVariable()
	{
		System.out.println("static int default value "+integerVar);
		System.out.println("static String default value "+stringVar);
		System.out.println("static char default value "+charVar);

		System.out.println(b);
	}*/
}