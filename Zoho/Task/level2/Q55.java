import java.util.Scanner;
import java.util.Arrays;

public class Main{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int num = sc.nextInt(), row=num*num, count=0;
		
		for(int i=1;i<=num;i++){
			int rev=i*num;
			while(count<=row){
				count++;
				if(i%2!=0)
					System.out.print(count+" ");
				else
					System.out.print(rev--+" ");
					
				if(count%num==0)
					break;
			}
			System.out.println();
		}
	}
}

