public class FunctionalInterface1{
	public static void main(String[] args){
		System.out.println("FunctionalInterface");
		A a = () ->{
			System.out.println("method1");
		};
		a.method1();
		System.out.println(a);
		
		/*B b = (x, y)->{
			return x+y;
		};*/
		B b = (x, y)->x+y;
		System.out.println(b.add(100, 100));
	}
}
@FunctionalInterface
interface A{
	void method1();
}
interface B{
	int add(int x, int y);
}
