import java.util.Scanner;

public class Q2{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int remainder = 0, result = 0, num = 0, temp = 0;

		try{
			num = sc.nextInt();
			temp=num;
			while(num>0){
				remainder = num%10;
				result += (remainder*remainder*remainder);
				num=num/10;
			}
			if(result==temp)
				System.out.println(temp+" is an Armstrong number.");
			else
				System.out.println(temp+" is not Armstrong number.");
			
		}catch(Exception e){
			System.out.println("Invalid input");
		}
	}
}
