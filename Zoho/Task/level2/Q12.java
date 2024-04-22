import java.util.Scanner;

public class Q12{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			char value = sc.next().charAt(0);
		if(Character.isAlphabetic(value)){
		for(char i='A';i<value;i++){
			for(char j=value;j>=i;j--){
				System.out.print(" ");
			}
			for(char j='A';j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(char i=value;i>='A';i--){
			for(char j=value;j>=i;j--){
				System.out.print(" ");
			}
			for(char j='A';j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		}else
			System.out.println("Invalid input.");

	}
}