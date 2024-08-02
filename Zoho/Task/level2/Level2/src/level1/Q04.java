package level1;

public class Q04 {

	public static void main(String[] args) {
		System.out.println(zoho(new int[] {0,0,1,0,0}, 1));
	}

	public static boolean zoho(int[] arr, int n) {
		int count = 0;
		for (int i = 0 ; i < arr.length; i++) {
			if (arr[i] == 0) {
				boolean a = (i == 0) || (arr[i - 1] == 0);
				boolean b = (i == arr.length-1) || (arr[i + 1] == 0);
				if (a && b) {
				arr[i] = 1;
				count++;
				}
			}
		}
		return count >= n;
		}
}
