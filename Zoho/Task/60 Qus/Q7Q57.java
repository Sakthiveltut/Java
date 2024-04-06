import java.util.*;

public class Q7Q57{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(), count=0;
		
		/*for(int i=1;i<=num;i++){
			for(int j=num;j>=1;j--){
				if(j==num-count || j==1+count)
					System.out.print(i);
				else
					System.out.print(" ");
			}
			count++;
			System.out.println();
		}*/
		
		/*for(int i=1;i<=num;i++){
			for(int j=num;j>=1;j--){
				if(j==num-count || j==1+count)
					System.out.print(j);
				else
					System.out.print(" ");
			}
			count++;
			System.out.println();
		}*/
		
		for(int i=1;i<=num;i++){
			for(int j=1;j<=num;j++){
				if(j==num-count || j==1+count)
					System.out.print(j);
				else
					System.out.print(" ");
			}
			count++;
			System.out.println();
		}
	}
}

