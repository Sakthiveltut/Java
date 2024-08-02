package level1;

import java.util.Arrays;

public class Q03 {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(zoho(new int[] {2,3,4}, new int[] {0,1,2,3,4,5})));
	}
	
	public static int[] zoho(int[] nums1, int[] nums2) {
		int[] ans = new int[nums1.length];
		for(int i = 0; i < nums1.length; i++) {
		int temp = -1, j = nums2.length - 1;
		while(j >= 0 && nums2[j] != nums1[i]) {
			if(nums2[j] > nums1[i])
				temp = nums2[j];
				j--;
			}
			ans[i] = temp;
			}
		return ans;
	}

}
