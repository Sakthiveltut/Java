import java.util.Scanner;
class CopyConstructor
{
	int age;
	String name;
	CopyConstructor(int a,String n)
	{
		age=a;
		name=n;
	}
	CopyConstructor(CopyConstructor cc)
	{
		age=cc.age;
		name=cc.name;
	}
	void display()
	{
		System.out.println("Your name is : "+name + "\nAge is : "+age);
	}
	public static void main(String[] arg)
	{
		System.out.print("Enter your name and age :");
		Scanner scan  = new Scanner(System.in);
		String name =scan.nextLine();
		int age =scan.nextInt();
		CopyConstructor cc = new CopyConstructor(age,name);
		CopyConstructor c2=new CopyConstructor(cc);
		cc.display();
		c2.display();
	}
}
