import java.util.*;

public class Q43Q46{


	public static void main(String[] args){
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();*/
		
		int arr[] = {1,2,3,4,5}; //2,3,4,5,1
		
		for(int i=arr.length-1,temp=0;i>=0;i--){
			if(i!=0){
				temp = arr[i-1];
				arr[i-1] = temp;
			}else{
				temp = arr[0];
				arr[arr.length-1] = temp;
			}
			System.out.println(Arrays.toString(arr));

		}
		System.out.println(Arrays.toString(arr));
					
	}
}

