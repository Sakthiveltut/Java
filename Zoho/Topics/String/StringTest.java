public class StringTest{
	static String d;

	public static void main(String[] args){
		String a = new String("mosesh");
		Integer i = new Integer(10);
		String b = "sakthi";
		String c = null;

		//String a = "mosesh"+true;
		System.out.println(a);	
		System.out.println(i);	
		
		/*System.out.println(a instanceof String);
		System.out.println(b instanceof String);
		System.out.println(c instanceof String);
		System.out.println(d instanceof String);*/


		String a = "Rahul", b = "Mosesh";
		
		System.out.println(a+b);
		//System.out.println(a*b);// error: bad operand types for binary operator '*'
		
	}
}
