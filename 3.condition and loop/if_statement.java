import java.util.Scanner;
 
public class if_statement {
    public static void main(String args[]) {
        int age;
        System.out.println("Enter Your Age : ");
        Scanner in = new Scanner(System.in);
        age=in.nextInt();
        if(age>=18)
        {
            System.out.println("You are Eligible For Vote...");
        }
    }
}

