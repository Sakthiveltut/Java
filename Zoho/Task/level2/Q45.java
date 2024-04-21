package level2;
import java.util.Scanner;
import array.ArrayOperations;

public class Q45{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int arr[] = ArrayOperations.getValues();
		String multipleNum = "";
		System.out.println("Enter N value: ");
		try{
			int n =sc.nextInt(),sum=0;

			for(int i=0;i<arr.length;i++){
				sum=arr[i];
				multipleNum +=arr[i]+" ";
				if(n==arr[i])
					System.out.println(arr[i]);
				for(int j=i+1;j<arr.length;j++){
					if(n==arr[i]+arr[j])
						System.out.println(arr[i]+" "+arr[j]);
					sum+=arr[j];
					multipleNum +=arr[j]+" ";
					if(n==sum && multipleNum.length()>5){
						System.out.println(multipleNum);
					}
				}
				multipleNum="";
			}
		}catch(Exception e){
			System.out.println("Invalid input.");
		}
	}
}

