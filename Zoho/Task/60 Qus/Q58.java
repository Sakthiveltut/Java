import java.util.*;

public class Q58{


	public static void main(String[] args){
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();*/
		
		int num = 4, count = 0;
		int underscore = num;
		int startCount = num * 2;
		
		for(int i=1;i<=startCount;i++){
			for(int j=1;j<=startCount;j++){
				if(i==1 || i==startCount)
					System.out.print("*");
				else{
					if(count>underscore){
						count-=2;
					}
					if(j<underscore || j>=underscore+count){
						System.out.print("*");
					}
					else{
						System.out.print("__");
						j++;
					}
				}	
			}
			underscore++;
			count+=2;
			System.out.println();
		}
			
	}
}

