package level1;

public class Q09 {

	public static void main(String[] args) {
		System.out.println(zoho("D4V1D"));
	}
	
	public static String zoho(String s) {
		char[] c = s.toCharArray();
		for(int i = 1; i<c.length; i = i + 2)
		c[i] = (char) (c[i - 1] + c[i] - '0'); return String.valueOf(c);
	}
}
