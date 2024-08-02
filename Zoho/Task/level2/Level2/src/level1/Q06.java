package level1;

public class Q06 {

	public static void main(String[] args) {
		System.out.println(zoho(new int[] {1,3,5,7,11}));
	}
	
	public static boolean zoho(int[] arr) {
		for (int i = 0; i < arr.length; i++) { int target = 2 * arr[i]; int a = 0, b = arr.length - 1; while (a <= b) {
		int mid = a + (b-a)/2; if (arr[mid] == target && mid != i) return true; if (arr[mid] <target) a = mid + 1; else b=mid - 1;
		}
		}
		return false;
	}

}
