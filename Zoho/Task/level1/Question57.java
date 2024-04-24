import java.util.Scanner;

public class Question57{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		
		for(int i=0;i<num.length();i++){
			for(int j=0;j<num.length();j++){
				if(j==i || j==num.length()-i-1)
					System.out.print(num.charAt(j));
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}

