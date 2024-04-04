import java.util.*;


public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int num = sc.nextInt();
		int total = 0, iteration;
		for(iteration=1;total<=num;iteration++){
			total+=iteration;
			//System.out.println(iteration+" "+total);
		}
		
		int count = 1;
		a:
		for(int i=1;i<iteration;i++){
			for(int j=i;j<iteration;j++){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				if(count>num){
					break a;
				}
				if(String.valueOf(count).length() == 1){
					System.out.print(" "+count+" ");
				}else{
					System.out.print(count+" ");
				}
				count++;
			}
			System.out.println();
		}
		
		
		
		/*for(int i=1;i<12;i++){
			for(int j=i;j<12;j++){
				System.out.print(" ");
			}
			//System.out.println();
			for(int j=i;j>0;j--){
				System.out.print(i+" ");
			}
			System.out.println();
		}*/
	}
}