import java.util.Scanner;

public class Q36 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		try{
		int num = sc.nextInt();
		int rem =0, result =0,temp=num;
		while(num>0){
			rem=num%10;
			result=rem+result*10;
			num=num/10;
		}
		isPrime(result);
		}catch(Exception e){
			System.out.println("Invalid input.");
		}
	}
		static void isPrime(int num){
			if(num==2){
				System.out.println(num+" is  Twisted Prime");	
				}
			for(int i=2;i<num;i++){
			if(num%i==0){
				System.out.println(num+" is a not Twisted Prime");
				break;
			}
			else if(i==num-1){
				System.out.println(num+" is  Twisted Prime");
			}
		}
		}
}