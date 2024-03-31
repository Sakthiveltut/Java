public class StringExample1{ 

	public static void main(String[] args){
	String a = "Rahul";
	String b = "Rahul";
	String c = "";
	
	String obj1 = new String("Sakthi");
	String obj2 = new String("Sakthi");
	
	String obj3 = new String("");

	test(a,b);
	test(b, "Rahul");
	test(obj1, obj2);
	test(obj1, obj2);
	test(c, obj3);
	test("", " ");
	test(null, "null");
	}

	public static void test(String a, String b){
		System.out.println(a==b);
		System.out.println("equals method "+a.equals(b));
		System.out.println("!= "+a!=b);
		System.out.println("--------------------");
	}
}

