import java.util.Scanner;

public class Question03{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp1=0, temp2=0;
		while(num>0){
			temp1 = num%10;
			temp2 = temp1 + temp2*10;
			num = num/10;
		}
		System.out.println(temp2);
	}
}