import java.util.Scanner;
import java.util.InputMismatchException;

public class CustomException{
	public static void main(String[] args){
		double balance = 500;
		try(Scanner sc = new Scanner(System.in)){
			System.out.println("Your account balance: "+balance);
			System.out.println("Enter a withdraw amount: ");
			double withdrawAmount = sc.nextInt();
			
			if(balance<withdrawAmount)
				throw new InsufficientFundException(withdrawAmount-balance);
			else
				System.out.println("Amount debitted");
		}catch(InputMismatchException e){
			System.out.println(e);
		}catch(InsufficientFundException e){
			System.out.println(e+" "+InsufficientFundException.insufficientAmount);
		}
	}
}

class InsufficientFundException extends Exception{
	static double insufficientAmount;
	InsufficientFundException(double insufficientAmount){
		this.insufficientAmount=insufficientAmount;
	}
}
