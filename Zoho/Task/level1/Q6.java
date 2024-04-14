import java.util.*;

public class Q6{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Starting Id: ");
		int startingId = sc.nextInt();
		System.out.println("Enter a Ending Id: ");
		int endingId = sc.nextInt();

		for(int i=startingId;i<startingId+4;i++){
			for(int j=i;j<=endingId;j+=4){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}

