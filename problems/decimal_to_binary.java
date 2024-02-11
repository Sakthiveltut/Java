import java.util.Scanner;

public class decimal_to_binary {
    public static void decimal2Binary(int n)
    {
        int[] binaryNum = new int[1000];
 
        int i = 0;
        while (n > 0)
        {
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binaryNum[j]);
    }
    public static void main(String args[]) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter The Decimal No : ");
        int n = in.nextInt();
        System.out.println("Decimal No : " + n);
        System.out.print("Binary No : ");
        decimal2Binary(n);
    }
    
}
