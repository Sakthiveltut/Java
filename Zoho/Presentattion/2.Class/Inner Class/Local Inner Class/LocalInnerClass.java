public class LocalInnerClass
{
	public static void main(String[] args)
	{
		OuterClass oc = new OuterClass();
		oc.outerMethod();

	}
}
class OuterClass
{
	static void outerMethod()
	{
		class InnerClass      //local inner class
		{
			void innerMethod()
			{
				System.out.println("innerMethod");
			}
		}
		
	InnerClass ic = new InnerClass();
	ic.innerMethod();
	}
	
}