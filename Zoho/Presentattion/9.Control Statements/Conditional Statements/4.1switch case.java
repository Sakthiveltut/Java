import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int num1, num2,choice;
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("Enter Your Choice : ");
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();
        System.out.println("Enter 2 Nos : ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        String message = switch (choice) {
            case 1 ->{
                yield "num1";
            }
            case 2 -> {
                yield "Subtraction : " + (num1 - num2);
            }
            case 3 -> {
                yield "Multiplication : " + (num1 * num2);
            }
            case 4 -> {
                yield "Division : " + (num1 / num2);
            }
            default -> {
		yield "Invalid Selection";
	    }
        };
        System.out.println(message);
    }
}
