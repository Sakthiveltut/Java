import java.util.Scanner;

public class Q13{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int num=0,rem=0,result=0,count=1,total=0;
		System.out.println("Enter a number: ");
		try{
			num = sc.nextInt();
			int temp=num;
			while(num>0){
				rem=num%10;
				result=rem+result*10;
				num/=10;
			}
			num=result;result=0;rem=0;
			while(num>0){
				rem=num%10;
				result=rem;
				if(count>1){
					for(int i=1;i<count;i++){
						result=result*rem;
					}
				}
				num/=10;
				count++;
				total+=result;
				result=0;
			}
			if(temp==total)
				System.out.println(temp+" is Disarium number.");
			else
				System.out.println(temp+" is not Disarium number.");
			
		}catch(Exception e){
			System.out.println("Invalid input.");
		}
	}
}
