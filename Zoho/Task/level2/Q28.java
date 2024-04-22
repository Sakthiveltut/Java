import java.util.Arrays;

public class Q28 {
	public static void main(String[] args) {
		int arr[][] = {{2,-9,3},{13,11,-17},{3,6,15},{4,13,1}};
		int row=0,col=0;
		
		int arr1[][] = new int[3][4];
		
		for(int i=0;i<arr[i].length;i++){
			for(int j=0;j<arr.length;j++){
				arr1[row][col] = arr[j][i];
				col++;
			}
			col=0;
			row++;
		}
		System.out.println(Arrays.deepToString(arr1));
	}
}


