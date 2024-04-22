import java.util.*;

public class Q7Q57{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		//int num = sc.nextInt();
		int count=0;
		
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
		
		/*for(int i=1;i<=num;i++){
			for(int j=1;j<=num;j++){
				if(j==num-count || j==1+count)
					System.out.print(j);
				else
					System.out.print(" ");
			}
			count++;
			System.out.println();
		}*/
		/*int count1=1;
		for(int i=0;i<num.length();i++){
			for(int j=0;j<num.length();j++){
				if(j==1+count || j==num.length()-count1)
					System.out.print(num.charAt(i));
				else
					System.out.print(" ");
			}
			count++;
			count1++;
			System.out.println();
		}*/
		
		/*for(int i=0;i<num.length();i++){
			for(int j=0;j<num.length();j++){
				if(j==i || j==num.length()-i-1)
					System.out.print(num.charAt(i));
				else
					System.out.print(" ");
			}
			System.out.println();
		}*/
		
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

