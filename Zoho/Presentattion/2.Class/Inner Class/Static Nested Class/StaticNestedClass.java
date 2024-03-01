public class StaticNestedClass
{
	static class InnerClass
	{
		static void innerMethod()
		{
			System.out.println("innerMethod");
		}	
	}	
	public static void main(String[] args)
	{
		StaticNestedClass.InnerClass si = new StaticNestedClass.InnerClass();
		si.innerMethod();

		StaticNestedClass.InnerClass.innerMethod();
	}	
}