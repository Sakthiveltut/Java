import java.util.*;

public class SortedArray{

	public static void main(String[] args){
		
		//int arr[] = {109,345,6675,234,5465,12,345,54,67,645,65,89};
		//int arr[] = {43,34,56,12,67,87};
		//int arr[] = {9,2,1,4,5,};
		int arr[] = {9,2,4,5,1};
		//int arr[] = {9,2,4,5,1,9,2,4,5,1};
		//int arr[] = {9,2,4,5,1,1,00,9,9,2,4,5,1};
		//int arr[] = {1,2,3,4,5,6,7,8};


		sortArray(arr,"decending");
		
	}	
	static int[] sortArray(int[] arr,String order){
		if(order == "ascending" || order == "decending"){
			for(int h=0;h<arr.length;h++){
				int position = h; //minimum value position
				for(int i=0;i<arr.length;i++){
					if(order == "ascending"?arr[position]<arr[i]:arr[position]>arr[i]){
						arr[position] = arr[position]+arr[i];
						arr[i] = arr[position]-arr[i];
						arr[position] = arr[position]-arr[i];
					}
					System.out.println(i+" "+Arrays.toString(arr));
				}
			}
		}else{
			System.out.println("Invalid parameter value.Allowed only 'ascending' or 'decending'");
		}
		return arr;
	}
}

