import java.util.Scanner;
import java.util.Arrays;

public class Question11{

	public static void main(String[] args){
		
		int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		int[][] result = new int[4][4];
		System.out.println(Arrays.deepToString(arr));
		int count=arr.length-1;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				result[i][j] = arr[j][count];
			}
			count--;
		}
		System.out.println(Arrays.deepToString(result));		
	}
}

