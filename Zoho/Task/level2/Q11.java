import java.util.Scanner;
import java.util.Arrays;

public class Q11{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String input = sc.nextLine(), reverse="", temp="";
		
		for(int i=0;i<input.length();i++){
			if(!Character.isWhitespace(input.charAt(i))){
				temp+=input.charAt(i);
			}
		}
		int length=temp.length()-1;
		for(int i=0;i<input.length();i++){
			if(Character.isWhitespace(input.charAt(i))){
				reverse+=input.charAt(i);
			}
			else if(length>=0){
				reverse+=temp.charAt(length--);
			}
		}
		System.out.println(reverse);
	}
}
