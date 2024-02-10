import java.util.Scanner;
public class array {
    //Arrays in Java
    public static void main(String args[])
    {
        int a[]={10,20,30,40,50,60,70,80,90,100};
        //Accessing Elements in array
        System.out.println(a[2]);
 
        //Print all Elements using for loop
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    //Print all Elements using Enhanced for loop
       for(int element : a)
       {
           System.out.println(element);
       }
 
        int b[]; // Declaring array
        b=new int[10]; // Allocating Memory to Array
        int [] c =new int[10]; //Combining Both Statement
 
        //Buy default all element have zero value
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