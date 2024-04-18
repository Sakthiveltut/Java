import java.util.Scanner;

public class TryWithResource{
	public static void main(String[] args){

		try(Scanner sc = new Scanner(System.in);Scanner sc = new Scanner(System.in);){
			int num = sc.nextInt();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}

