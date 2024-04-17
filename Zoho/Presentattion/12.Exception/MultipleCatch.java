import java.util.Scanner;

public class MultipleCatch{
	public static void main(String[] args){

		try{
			int arr[] = new int[5];
			//System.out.println(arr[10]);
			//System.out.println(10/0);			
		}catch(ArrayIndexOutOfBoundsException |ArithmeticException e){
			System.out.println(e);
		}catch(Exception e){
			System.out.println(e);
		}
	}
}

