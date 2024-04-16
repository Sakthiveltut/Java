import java.util.Scanner;
import java.util.Arrays;

public class Q30{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		//int a[][] = {{5,2,3,3},{4,5,6,5},{7,5,9,3},{7,5,9,3}};
		int a[][] = new int[4][4];
		try{
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a.length;j++){
					a[i][j]=sc.nextInt();
				}
			}
			
		System.out.println("Enter a row: ");
		int row = sc.nextInt();
		System.out.println("Enter a Column: ");
		int col = sc.nextInt();
		int value=a[row][col];
		System.out.println("Enter a new color: ");
		int color = sc.nextInt();
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
				if(a[i][j]==value){
					a[i][j]=color;
				}
			}
		}		
		System.out.println(Arrays.deepToString(a));
			
		}catch(Exception e){
			System.out.println("Invalid input.");
		}
	}
}
