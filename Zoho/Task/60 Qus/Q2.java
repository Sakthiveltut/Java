import java.util.*;

public class Q2{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a letter: ");
		char letter = sc.next().charAt(0);
		
		int iteration = 0;
		if(Character.isUpperCase(letter)){
			iteration = 91;
		}else if(Character.isLowerCase(letter)){
			iteration = 123;
		}
		for(char i=letter;i<iteration;i++){
			System.out.println(i);
		}		
	}
}

