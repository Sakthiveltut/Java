import java.util.Scanner;
public class array {
    public static void main(String args[])
    {
        int a[]={10,20,30,40,50,60,70,80,90,100};
        System.out.println(a[2]);
 
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
       for(int element : a)
       {
           System.out.println(element);
       }
 
        int b[20]; // Declaring array
        b=new int[10]; // Allocating Memory to Array
        int [] c =new int[10]; //Combining Both Statement
 
        for(int element : b)
        {
            System.out.println(element);
        }
 
        for(int i=0;i<3;i++)
        {
            Scanner in =new Scanner(System.in);
            System.out.println("Enter The Number");
            c[i]=in.nextInt();
        }
        for(int element : c)
        {
            System.out.println(element);
        }
 
    }
}