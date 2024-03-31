public class demo1{

	public static void main(String[] args){

		System.out.println("hello");
		demo2 d = new demo3();
		d.display();
		d.display1();
		System.out.println(d.var1);
		//System.out.println(d.var2); //cannot find symbol

		System.out.println("d instanceOf demo2"+(d instanceof demo2));
		System.out.println("d instanceOf demo3"+(d instanceof demo3));

		demo3 c = (demo3) d;
		c.display();
		c.display1();
		
	}
}
class demo2 {
	int var1 = 10;
	void display(){
		System.out.println("demo2");
	}
	void display1(){
		System.out.println("demo2");
	}
}
class demo3 extends demo2{
	int var1 = 100;
	void display(){
		System.out.println("demo3");
	}
	void display2(){
		System.out.println("demo2");
	}
}