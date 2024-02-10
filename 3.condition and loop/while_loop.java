import java.util.Scanner;

public class while_loop {

  public static void main(String args[]) {
    System.out.println("Enter The Limit : ");
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int i = 1;
    while (i <= n) {
      System.out.println(i);
      i++;
    }
  }
}
