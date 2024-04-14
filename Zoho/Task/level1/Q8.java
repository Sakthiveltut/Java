import java.util.*;

public class Q8{
	
	static{
			System.out.println("static block");
	}
	static String var = "static variable";
	public static void main(String[] args){
		
		method1();
		InnerClass.method2();
		System.out.println(name);

	}
	static void method1(){
		System.out.println("static method1");
	}
	static class InnerClass{
		static void method2(){
			System.out.println("static method2");
		}
	}
}

