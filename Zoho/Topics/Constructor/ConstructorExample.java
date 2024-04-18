class ConstructorExample
{  
	ConstructorExample(String name){
		System.out.println(name);
	}
	public static void main(String args[])
	{  
		//Student s1 = new Student();
		Student s2 = new Student("mosesh", 21);
	}
}
class Student 
{  
	String name;
	int age;
	/*Student(){
		System.out.println("default");
	}*/
	
	Student(String name){
		System.out.println(name);
	}
	
	Student(String name, int age){
		super()
		//super("sakthi");
		this.name = name;	
		this.age = age;
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
	}
}  
 