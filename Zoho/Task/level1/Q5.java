import java.util.*;

public class Q5{

	public static void main(String[] args){
		
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		char letter = sc.next().charAt(0);
		int iteration = 0;
		
		if(Character.isUpperCase(letter)){
			iteration = 64;
		}else if(Character.isLowerCase(letter)){
			iteration = 96;
		}else{
			iteration = letter;
			System.out.println("Invalid input.");
		}
		
		for(char i=letter;i>iteration;i--){
			for(char j=i;j>iteration;j--){
				System.out.print(i);
			}
			System.out.println();
		}
		
	}
}

