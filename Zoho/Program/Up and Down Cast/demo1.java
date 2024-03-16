public class demo1{

	public static void main(String[] args){

		System.out.println("hello");
		demo2 d = new demo3();
		d.display();
		d.display1();
	}
}
class demo2 {
	void display(){
		System.out.println("demo2");
	}
	void display1(){
		System.out.println("demo2");
	}
}
class demo3 extends demo2{
	void display(){
		System.out.println("demo3");
	}
	void display2(){
		System.out.println("demo2");
	}
}