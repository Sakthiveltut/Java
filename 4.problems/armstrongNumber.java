import java.util.Scanner;
 
public class armstrongNumber {
    //Write a program to check whether the given 3 digit number is armstrong or not
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 3 Digit Number : ");
        int number = in.nextInt();//123
        int temp = number;//123
        int digit1, digit2, digit3;
 
        digit3=temp%10;//3
        temp=temp/10;//12
 
        digit2=temp%10;//2
        temp=temp/10;//1
 
        digit1=temp%10;//1
        int result=(digit1 * digit1 * digit1)+( digit2 * digit2 * digit2)+(digit3 * digit3 * digit3);
 
        if(number==result){
            System.out.println(number + " is armstrong Number");
        }else{
            System.out.println(number + " is not an armstrong Number");
        }
 
 
    }
}