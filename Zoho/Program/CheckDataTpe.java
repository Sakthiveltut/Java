import java.util.ArrayList;

class CheckDataTpe{
    public static void main(String[] args) {
	String a = "%f43.5778";
	int b =10;
	System.out.println(nameOf(a));
	System.out.println(nameOf("name"+100+100));
	System.out.println(nameOf(+100+100+"name"));
	System.out.println(nameOf(b));
	}

	private static String nameOf(Object o) {
		//System.out.println(o);
    		//return o.getClass().getName();
		return o.getClass().getSimpleName();
	}
}
