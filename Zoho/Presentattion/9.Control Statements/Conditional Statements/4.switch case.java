import java.util.Scanner;
 
public class Main {
    public static void main(String args[]) {
        int num1, num2, result, choice;
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Enter Your Choice : ");
        Scanner input =new Scanner(System.in);
        choice=input.nextInt();
        System.out.println("Enter 2 Nos : ");
        num1=input.nextInt();
        num2=input.nextInt();
        switch (choice)
        {
            case 1:
                result=num1+num2;
                System.out.println("Addition : " +result);
                //continue;
				break; 
            case 2:
                result=num1-num2;
                System.out.println("Subtraction : "+result);
               	//continue;
				break;
            case 3:
                result=num1*num2;
                System.out.println("Multiplication : "+result);
               	break;
            case 4:
                result=num1/num2;
                System.out.println("Division : "+result);
                break;
            /*default:
                System.out.println("Invalid Selection");
                break;*/
        }
    }
}