import java.util.Scanner;
public class Calc{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int choice;
		do{
			long num1, num2;
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplication");
			System.out.println("4.Division");
			System.out.println("5.Exit");
			System.out.println("Enter your choice:");
			choice = sc.nextInt();
			
			System.out.println("Enter 2 Numbers:");
			
			String result = switch(choice){
			
			case 1:
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				yield num1+" + "+num2+" = "+(num1+num2);
			case 2:
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				yield num1+" - "+num2+" = "+(num1-num2);
			case 3:
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				yield num1+" * "+num2+" = "+(num1*num2);
			case 4:
				num1 = sc.nextInt();
				num2 = sc.nextInt();
				yield num1+" / "+num2+" = "+((double)num1/num2);
			case 5:
				yield "----------------\nThank You\n----------------";
			default:
				yield "----------------------\nchoose correct option\n----------------------";
			};
			System.out.println(result);
			System.out.println("--------------------------------------------------");	
				
		}while(choice != 5);				
	}
}