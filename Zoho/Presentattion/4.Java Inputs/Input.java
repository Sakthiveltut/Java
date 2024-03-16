import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();
        System.out.println("You entered: " + num);

        System.out.print("Enter a string: ");
        String str1 = scanner.nextLine();
	scanner.nextLine();
        System.out.println("You entered: " + str1);

	System.out.print("Enter a string: ");
        String str2 = scanner.nextLine();
        System.out.println("You entered: " + str2);

	System.out.print("Enter a float: ");
        float floatVar = scanner.nextFloat();
        System.out.println("You entered: " + floatVar);

	System.out.print("Enter a char: ");
        char charVar = scanner.next().charAt(0);
        System.out.println("You entered: " + charVar);
	
	System.out.print("Enter a double: ");
        double doubleVar = scanner.nextDouble();
        System.out.println("You entered: " + doubleVar);

	System.out.print("Enter a boolean: ");
        Boolean bool = scanner.nextBoolean();
        System.out.println("You entered: " + bool);

	
    }
}
