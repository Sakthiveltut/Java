import java.util.Scanner;
 
public class Factorial {
    public static void main(String args[])
    {
        //1.Write a program to find the factorial of given number.
        Scanner in =new Scanner(System.in);
        System.out.println("Enter The Number : ");
        int n=in.nextInt();//5
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println("Factorial of "+n+" is "+f);
    }
}