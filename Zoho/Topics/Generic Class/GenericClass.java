public class GenericClass{
	public static void main(String[] args){
		A.getValue();
	}
	
}
class A<T>{
	static T value;
	
	void getValue(){
		System.out.println(value);
	}
}

