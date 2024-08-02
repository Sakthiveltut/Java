package level1;

public class Q11 {

	public static void main(String[] args) {
		System.out.println(zoho("RLRRLLRLRL"));
	}
	
	public static int zoho(String s) {
		int result = 0;
		int sum = 0;
		for (char c: s.toCharArray()) {
			sum += (c == 'R' ? 1 : -1);
			if (sum == 0)
				result++;
		}
		return result;
	}

}
