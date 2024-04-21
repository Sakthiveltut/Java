//package level2;
import java.util.Scanner;
import java.util.Arrays;

public class Q56{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int arr[] = {16, 17, 4, 3, 5, 2};
		int num=33;
		/*int one=1, eight=8, nine=9,eightEight=89, result=0;
		for(int i=1;i<10;i++){
			System.out.println(result+=1);
			System.out.println(result+=nine);
			System.out.println(result+=1);
			System.out.println(result+=eightEight);
			if(Pattern.compile("^[1]+$").matcher(""+result)){
				eightEight=eightEight*10+9;
			}
		}*/
		
		for(int i=1;i<num;i++){
			if(Pattern.compile("^[1]+[0]?+$").matcher(i)){
				System.out.println();
		}
	}
}

