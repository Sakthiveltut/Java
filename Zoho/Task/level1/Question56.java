import java.util.Scanner;
import java.util.Arrays;

public class Question56{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		try{
			System.out.println("Enter a number: ");
			int num = sc.nextInt();
			int total = 0, iteration;
			
			for(iteration=1;total<=num;iteration++){
				total+=iteration;
			}
			
			int count = 1;
			a:
			for(int i=1;i<iteration;i++){
				for(int j=i;j<iteration;j++){
					System.out.print(" ");
				}
				for(int j=1;j<=i;j++){
					
					if(count>num)
						break a;
					if(count<10)
						System.out.print(" "+count+++" ");
					else
						System.out.print(count+++" ");
				}
				System.out.println();
			}
		}catch(Exception e){
			System.out.println("Invalid input.");		
		}
	}
}