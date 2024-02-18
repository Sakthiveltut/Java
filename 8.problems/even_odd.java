import java.util.Scanner;
 
public class even_odd {
    //Write a program to count even and odd numbers in an array
    public static void main(String[] args) {
        int e = 0, o = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Limit : ");
        int n = in.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter a[" + i + "] value : ");
            a[i] = in.nextInt();
        }
        for (int element : a) {
            if (element % 2 == 0) {
                e++;
            } else {
                o++;
            }
        }
        System.out.println("Total Even Nos : " + e);
        System.out.println("Total Odd Nos  : " + o);
    }
}