public class SingletonClass
{
	public static void main(String[] args)
	{
		ABC a = ABC.getInstance();
		a.display();
	
		ABC b = ABC.getInstance();
		b.display();

		ABC c = ABC.getInstance();
		c.display();

		System.out.println(a+" "+b+" "+c);
		System.out.println(a.hashCode()+" "+b.hashCode()+" "+c.hashCode());
	}
}

class ABC
{
	private static ABC obj;
	private ABC(){}

	public static ABC getInstance()
	{
		if(obj == null)
		{
			obj = new ABC();
		}
		return obj;
	}
	void display()
	{
		System.out.println("Hello");
	}
}

	