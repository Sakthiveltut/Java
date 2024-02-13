import java.util.Scanner;

public class nextAndnextLine {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a line of text:");
    String line = scanner.nextLine();
    System.out.println("You entered: " + line);

    System.out.println("Enter a word:");
    String word = scanner.next(); //remove all when after space
    System.out.println("You entered: " + word);

    scanner.close();
  }
}
