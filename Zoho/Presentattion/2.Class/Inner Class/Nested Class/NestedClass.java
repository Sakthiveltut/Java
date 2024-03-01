class OuterClass
{
	private int outerClassVar = 5;
	
	protected class InnerClass
	{	
		void innerMethod()
		{
			System.out.println("innerMethod");
			System.out.println(outerClassVar);
		}
	}
	
	void outerMethod()
	{
		InnerClass ic = new InnerClass();
		ic.innerMethod();
		System.out.println("outerMethod");
	}
}
public class NestedClass
{	
	public static void main(String[] args)
	{
		OuterClass oc = new OuterClass();
		oc.outerMethod();

		OuterClass.InnerClass oi = new OuterClass().new InnerClass();
		oi.innerMethod();
	}
}