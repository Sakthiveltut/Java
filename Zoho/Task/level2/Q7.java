import java.util.Scanner;

public class Q7{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String input = sc.nextLine();
		
		System.out.println("Enter a rotate value: ");
		int rotate = sc.nextInt();
		
		char arr[] = input.toCharArray();
	
		for(int h=0;h<rotate;h++){
			for(int i=0;i<arr.length-1;i++){
					char temp = arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=temp;
			}
		}
		for(char c: arr){
			System.out.print(c);
		}
		
		System.out.println();
		for(int h=0;h<rotate;h++){
			for(int i=arr.length-1;i>0;i--){
					char temp = arr[i-1];
					arr[i-1]=arr[i];
					arr[i]=temp;
			}
		}
		for(char c: arr){
			System.out.print(c);
		}
		
	}
}

