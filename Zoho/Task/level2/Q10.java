import java.util.Scanner;

public class Q9{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int remainder = 0, result = 0, num = 0;

		try{
			num = sc.nextInt();
			result=num;
			while(true){
				result=reverse(result);
				if(num==result){
					System.out.println(result+" is Palindrome.");
					break;
				}
				else
					System.out.println(num+"+"+result+"="+(num+result));
					result+=num;
					num=result;
			}
		}catch(Exception e){
			System.out.println("Invalid input");
		}
	}
	static int reverse(int num){
		int remainder = 0, result = 0;
		while(num>0){
			remainder = num%10;
			result = remainder+result*10;
			num=num/10;
		}
		return result;
	}
}
