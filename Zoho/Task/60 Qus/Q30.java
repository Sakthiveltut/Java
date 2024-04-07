import java.util.*;

public class Q30{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num[] = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
	int result = num[0];
	for(int i = 0;i<num.length;i++){
		if(result<num[i]){
			result = num[i];
		}
	}
	System.out.println("Largest number is "+result);
	}
}