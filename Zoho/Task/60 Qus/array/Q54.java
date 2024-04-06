package array;

import java.util.*;

public class Q54{

	public static void main(String[] args){
		
		//int arr[] = {9,8,7,6,5,4,3,2,1};
		int arr[] = {13,2,4,15,12,10,5};
		int mid = arr.length/2;
		

		/*arr = ArrayOperations.sortArray(arr, "ascending");
		int count=arr.length-1;
		for(int i=0;i<=count;i+=2){
			if(count == i){
				break;
			}
			arr[i] = arr[i] + arr[count];
			arr[count] = arr[i] - arr[count];
			arr[i] = arr[i] - arr[count];
			count-=2;
		}*/
		
		int odd[] = new int[arr.length-mid];
		int even[] = new int[mid];
		for(int i=1,count = 0;i<arr.length;i+=2){
			even[count] = arr[i];
			count++;
 		}
		for(int i=0, count=0;i<arr.length;i+=2){
			odd[count] = arr[i];
			count++;
 		}
		odd = ArrayOperations.sortArray(odd, "decending");
		even = ArrayOperations.sortArray(even, "ascending");
		
		for(int i=0,count1=0,count2=0;i<arr.length;i++){
			if(i%2==0){
				arr[i] = odd[count1];
				count1++;
			}else{
				arr[i] = even[count2];
				count2++;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(odd));
		System.out.println(Arrays.toString(even));


	}
}

