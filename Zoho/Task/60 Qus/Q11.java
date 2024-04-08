public class Q11{

	public static void main(String[] args){
		
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		int[][] result = new int[3][3];
		System.out.println(Arrays.deepToString(arr));
		int count=2;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				result[i][j] = arr[j][count];
			}
			count--;
		}
		System.out.println(Arrays.deepToString(result));		
	}
}

