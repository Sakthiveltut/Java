import java.util.Arrays;
import java.util.Scanner;

public class Q52{
	static String words[];
	static int length;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String sentence = sc.nextLine();
		words = sentence.split(" ");
		length=words.length-1;
		recursion();
	}
	static void recursion(){
		if(length>=0){
			System.out.println(words[length--]);
			recursion();
		}
	}
}