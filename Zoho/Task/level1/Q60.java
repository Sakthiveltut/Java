import java.util.Scanner;

public class Q60{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt(), result = 0;
		String temp = "";
		for(int i=1;i<=num;i++){
			for(int j=i;j>=1;j--){
				temp+="1";
				System.out.print(1);
			}
			System.out.println();
			result += Integer.parseInt(temp); 
			temp = "";
		}
		System.out.println(result);
	}
}