import java.util.Scanner;

public class Q16{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[3][3];
		
		try{
			for(int i=0;i<arr.length;i++){
				for(int j=0;j<arr.length;j++){
					arr[i][j]=sc.nextInt();
				}
			}
			
			int small=arr[0][0],large=arr[0][0], pos=0;
			
			for(int i=0;i<arr.length;i++){
				small=arr[i][0];large=arr[0][i];
				for(int j=0;j<arr.length;j++){
					if(small>arr[i][j]){
						pos=j;
						small=arr[i][j];
					}
				}
				for(int j=0;j<arr.length;j++){
					if(large<arr[j][pos]){
						large=arr[j][pos];
					}
				}
				if(small==large){
					System.out.println("Saddle point is "+small);
					break;
				}
			}
		}catch(Exception e){
			System.out.println("Invalid input.");
		}
	}
}
