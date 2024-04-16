import java.util.Scanner;

public class Q7{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a original string: ");
		String input1 = sc.nextLine();
		
		System.out.println("Enter a rotated string: ");
		String input2 = sc.nextLine();
		
		
		try{
			String result="";
			char arr[] = input1.toCharArray();
	
			for(int h=0;h<arr.length;h++){
				for(int i=0;i<arr.length-1;i++){
						char temp = arr[i+1];
						arr[i+1]=arr[i];
						arr[i]=temp;
				}
				for(char c: arr)
					result+=c;
				if(result.equals(input2)){
					System.out.println(true);
					break;
				}
				else if(h==arr.length-1)
					System.out.println(false);
				result="";
			}
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

