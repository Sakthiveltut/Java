import java.util.*;

public class Q10{

	public static void main(String[] args){
		
		//int arr[] = {1,2,3,4,5,6,7};
		//int arr[] = {67,89,90,92,98,100,104,108};
		//int arr[] = {7,2,4,5,3,1,6};
		int arr[] = {11,32,0,5,8,91,62,54,34,34,33,25};
		//0,5,8,11,25,32,33,34,34,54,62,91
		arr = sortArray(arr,"ascending");
		System.out.println(Arrays.toString(arr));
		int mid = arr.length/2;
		
		int result[] = new int[arr.length];
		int j=0,k=arr.length-1;
		for(int i=0;i<arr.length;i++){
			while(k>=mid){
				result[i]=arr[k];
				k--;
				i++;
				break;
			}
			while(j<mid){
				result[i]=arr[j];
				j++;
				break;
			}			
		}
		System.out.println(Arrays.toString(result));
		
		//sortArray(arr,"decending");
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

