import java.util.Scanner;

public class Q7{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String1: ");
		String input1 = sc.nextLine();
		
		System.out.println("Enter a String2: ");
		String input2 = sc.nextLine();
		
		System.out.println("Enter a rotate value: ");
		
		try{
			int rotate = sc.nextInt();
			String result="";
			char arr[] = input1.toCharArray();
	
			for(int h=0;h<rotate;h++){
				for(int i=0;i<arr.length-1;i++){
						char temp = arr[i+1];
						arr[i+1]=arr[i];
						arr[i]=temp;
				}
			}
			for(char c: arr){
				result+=c;
			}
			if(result.equals(input2)){
				System.out.println(true);
			}else
				System.out.println(false);
		}catch(Exception e){
			System.out.println("Invalid input.");
		}
		
		/*System.out.println();
		for(int h=0;h<rotate;h++){
			for(int i=arr.length-1;i>0;i--){
					char temp = arr[i-1];
					arr[i-1]=arr[i];
					arr[i]=temp;
			}
		}
		for(char c: arr){
			System.out.print(c);
		}*/
		
	}
}

