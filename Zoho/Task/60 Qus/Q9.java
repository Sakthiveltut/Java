import java.util.*;

public class Q9{

	public static void main(String[] args){
		
		int arr1[] = {1,2,3,4,5};
		int arr2[] = {1,2,8,9,10};
		int result[] = new int[];
		
		
		//System.out.println(Arrays.toString(result));
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
					//System.out.println(i+" "+Arrays.toString(arr));
				}
			}
		}else{
			System.out.println("Invalid parameter value.Allowed only 'ascending' or 'decending'");
		}
		return arr;
	}
}

