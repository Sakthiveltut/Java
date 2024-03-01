public class SingletonClass
{
	public static void main(String[] args)
	{
		ABC a = ABC.getInstance();
		a.display();
	}
}

class ABC
{
	public static ABC obj = null;
	private ABC(){}
	//this method return object
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

	