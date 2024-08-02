package level1;

public class Q02 {

	public static void main(String[] args) {
		System.out.println(zoho(new int[] {1,3,5,6,8}, 7));
	}
	
	public static int zoho(int[] A, int target) {
		int low = 0, high = A.length-1;
		while(low<=high) {
			int mid = (low+high)/2; 
			if(A[mid] == target) return mid;
			else if(A[mid] > target) high = mid-1;
			else low = mid+1;
		}
		return low;
	}
}
