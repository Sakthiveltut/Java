import java.util.Scanner;
 
public class scannerClass {
    public static void main(String args[])
    {
        //a2+b2+2ab
        Scanner in =new Scanner(System.in);
        //int a,b,c;
        float a,b,c;
        System.out.println("Enter 2 Nos : ");
        //a=in.nextInt();
       // b=in.nextInt();
        a=in.nextFloat();
        b=in.nextFloat();
        c=(a*a)+(b*b)+(2*a*b);
        System.out.println("Result : "+c);
 
    }
}