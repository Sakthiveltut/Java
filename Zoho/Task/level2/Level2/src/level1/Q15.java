package level1;

public class Q15 {

	public static void main(String[] args) {
		System.out.println(zoho(new int[] {9,14,19,24}));
	}
	
	public static int zoho(int[] nums) {
		int n = nums.length;
		return Math.min(help(nums, n-1), help(nums, n-2));
	}
	private static int help(int[] nums, int n) {
		if (n<0)
		return 0;
		if (n==0 || n==1) return nums[n];
		return nums[n] + Math.min(help(nums, n-1), help(nums, n-2));
	}
}
