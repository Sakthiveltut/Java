public class VariableExample
{

	public static int staticVar = 10;	//static variable
	private int instanceVar = 20;		//instance variable 	    
	
	//main method
	public static void main(String[] args)
	{
		int localVar = 30;	//local variable
		VariableExample object = new VariableExample();

		System.out.println("Java Variables");
		System.out.println("Local Variable "+ localVar);
		System.out.println("Instance Variable "+ object.instanceVar);
		System.out.println("Static Variable "+ staticVar);
		System.out.println("Static Variable "+ VariableExample.staticVar);
	}
}