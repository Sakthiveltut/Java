public class ClassExample
{
  	public static void main(String[] args)
	{	
		Student object = new Student();
    		
		object.name = "Mosesh";
		object.age = 21;
		System.out.println(object.name);
    		System.out.println(object.age);
  	}
}
class Student
{
	protected int age;
	protected String name;

}