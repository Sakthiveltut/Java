import java.util.ArrayList;

public class CheckDataTpe{
    public static void main(String[] args) {
	String a = "%f43.5778";
	int b =10;
	System.out.println(nameOf(a));
	}

	private static String nameOf(Object o) {
    		return o.getClass().getSimpleName();
	}
}
