import java.util.*;

public class Q52{

	public static void main(String[] args){
		
		recursion();
	}
	static void recursion(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence = sc.nextLine();
		String[] words = sentence.split(" ");
		recursion();
	}
}

