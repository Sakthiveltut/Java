package array;
import java.util.*;

public class ArrayOperations{

	public static void main(String[] args){
		
		//int arr[] = {109,345,6675,234,5465,12,345,54,67,645,65,89};
		//int arr[] = {43,34,56,12,67,87};
		//int arr[] = {9,2,1,4,5,};
		//int arr[] = {0,9,2,4,5,1,1,45,4,8,8,8,8,8,};
		//int arr[] = {9,2,4,5,1,1,45,4,8,8,8,8,8,0};
		//int arr[] = {9,2,4,5,1,1,45,4,8,8,8,8,8};
		//int arr[] = {9,2,4,5,1,9,2,4,5,1};
		
		//int arr[] = {9,2,4,5,1,1,00,9,9,2,4,5,1};
		//int arr[] = {1,2,3,4,5,6,7,8};
		//int arr[] = {0,00,1,1,3,3,3,3,5,5,5,};
		//int arr[] = {0,00,0,0,00,0,0,};
		
		//int arr[] = {1,1,2,2,2,3,3,3,3,4,4};

		//sortArray(arr,"decending");
		//System.out.println(Arrays.toString(removeDuplicates(arr)));
		//System.out.println(arr.length);
		
		//System.out.println(Arrays.toString(getValues()));
	}
	public static int[] sortArray(int[] arr,String order){
		if(order.equals("ascending") || order.equals("decending")){
			for(int h=0;h<arr.length;h++){
				int position = h;
				for(int i=0;i<arr.length;i++){
					if(order == "ascending"?arr[position]<arr[i]:arr[position]>arr[i]){
						arr[position] = arr[position]+arr[i];
						arr[i] = arr[position]-arr[i];
						arr[position] = arr[position]-arr[i];
					}
				}
			}
		}else{
			System.out.println("Invalid parameter value.Allowed only 'ascending' or 'decending'");
		}
		return arr;
	}
	
	public static int[] removeDuplicates(int[] arr){
		int[] temp = new int[arr.length];
		int count =0;
		boolean zero=false;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<=i;j++){
				if(arr[i]==0 && zero==false){
					temp[count++]=arr[i];
					zero=true;
				}
				if(arr[i]==temp[j]){
					//System.out.print(arr[i]+" "); //print duplicates 0 issue
					break;
				}
				if(j==i){
					temp[count++]=arr[i];
				}
			}
		}
		int result[] = new int[count];
		for(int i=0;i<result.length;i++){
			result[i] = temp[i];
		}
		return result;
	}
	
	public static int[] getValues(){
		Scanner sc = new Scanner(System.in);
		int count = 0,temp[],i=0;
		int arr[] = new int[count];
		String str = "";
		System.out.println("('break' to exit): ");
		while(count>=0){
			str = sc.next();
			if(str.equals("break"))
				return arr;
			try{
				temp = arr;
				arr = new int[++count];
				for(int j=0;j<temp.length;j++){
					arr[j]=temp[j];
				}
				arr[i++] = Integer.parseInt(str);
			}
			catch(Exception e){
				System.out.println("Invalid input.");
			}
		}
		return arr;
	}
}

