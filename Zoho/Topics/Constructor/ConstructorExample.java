class ConstructorExample
{  
	public static void main(String args[])
	{  
		//A a=new A(10); 
		A a1=new A();   //error when default constructor 
		 
	}
	}
class A
{  
	
	A(){
		//this(10); 		
		System.out.println("This Called Default constructor");
		
	}
	
}  
 