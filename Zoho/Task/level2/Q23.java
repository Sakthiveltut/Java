import java.util.Scanner;
import java.util.Arrays;

public class Q23{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		//int arr[][] = new int[3][3];
		
		//int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int arr[][] = new int[4][4];
		int arr1[][] = new int[4][4];
		
		try{
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr.length;j++){
					arr[i][j]=sc.nextInt();
				}
			}
			
			int count1=0, count2=0;
			for(int i=0;i<arr.length;i++){
				while(count1<arr.length && count1>=0){
					System.out.println("count "+count1);
					arr1[i][count2++]=arr[count1][i];
					if(i%2==0)
						count1++;
					else
						count1--;
				}
				if(i%2==0)
					count1--;
				else
					count1++;
				count2=0;
			}
			System.out.println(Arrays.deepToString(arr1));
			
		}catch(Exception e){
			System.out.println("Invalid input.");
		}
	}
}
