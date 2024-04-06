import java.util.*;

public class Q3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp1=0, temp2=0;
		while(num>0){
			temp1 = num%10;
			temp2 = (temp2 + temp1)*10;
			num = num/10;
			System.out.println("temp1 "+temp1);
			System.out.println("temp2 "+temp2);			
			System.out.println("num "+num);
		}
		int temp3 = temp2/10;
		int result = num-temp3;
		System.out.println(result);
	}
}