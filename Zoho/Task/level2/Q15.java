import java.util.Scanner;

public class Q15{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		try{
			int num = sc.nextInt();
			for(int i=1;i<=num;i++){
				for(int j=i+1;j<=num;j++){
					if(i*j==num && i+1==j){
						System.out.println(num+" is a pronic number.");
						System.out.println(i+"x"+j+"="+num);
						break;
					}else if(i==num-1)
						System.out.println(num+" is not a pronic number.");				
				}
			}
		}catch(Exception e){
			System.out.println("Invalid input.");
		}
	}
}
