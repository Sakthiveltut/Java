import java.util.*;

public class Q58{


	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		int count = 0;
		int starCount = num * 2;
		int star=num;
		
		for(int i=1;i<starCount;i++){
			for(int j=1;j<=starCount;j++){
				if(i==1 || i==starCount-1)
					System.out.print("*");
				else{
					if(j<=star || j>star+count){ 
						System.out.print("*");
					}
					else{
						System.out.print("_");
					}
				}	
			}
			if(i<num){
				count+=2;
				star--;
			}else{
				count-=2;
				star++;
			}
			System.out.println();
		}
	}
}

