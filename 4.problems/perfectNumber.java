import java.util.Scanner;
public class perfectNumber {
    //Write a program to check the given number is perfect number or not.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int n = in.nextInt();//6
        int sum=0;
        for (int i = 1; i <n; i++) {
            if(n%i==0){
                sum+=i;//1+2+3
            }
        }
        if(sum==n){
            System.out.println(n + " is a Perfect Number");
        }else {
            System.out.println(n + " is not a Perfect Number");
        }
    }
}