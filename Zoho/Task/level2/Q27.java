import java.util.Scanner;

public class Q27{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		//int a[][] = {{1,2,3},{1,2,3},{1,2,3}};
		int x=0, y=0, z=0;
		int a[][] = new int[3][3];
		
		try{
			for(int i=0;i<a.length;i++){
				for(int j=0;j<a.length;j++){
					a[i][j]=sc.nextInt();
				}
			}
			
			x=a[0][0]*((a[1][1]*a[2][2])-(a[2][1]*a[1][2]));
			y=a[0][1]*((a[1][0]*a[2][2])-(a[2][0]*a[1][2]));
			z=a[0][2]*((a[1][0]*a[2][1])-(a[2][0]*a[1][1]));
			
			System.out.println(x-y+z);
		}catch(Exception e){
			System.out.println("Invalid input.");
		}
	}
}
