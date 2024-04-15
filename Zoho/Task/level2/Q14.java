import java.util.Scanner;

public class Q14{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String input = sc.nextLine(), result="";
		for(int h=0;h<input.length();h++){
			for(int i=h;i<input.length();i++){
				for(int j=h;j<=i;j++){
					result+=input.charAt(j);
				}
				System.out.println(result);
				result="";
			}
		}
	}
}
