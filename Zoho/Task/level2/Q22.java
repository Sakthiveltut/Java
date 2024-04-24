import java.util.Scanner;
import java.util.Arrays;
import array.ArrayOperations;

public class Q22{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//int arr[] = {10,20,30,40,50,60,70,80,90};
		
		System.out.println("Enter a values: ");
		int arr[] = ArrayOperations.getValues();
		//arr = ArrayOperations.sortArray(arr,"ascending");
		boolean match = false;
		String array = checkSort(arr);
		try{
			if(array.equals("asc") || array.equals("dec")){
				System.out.println("Enter a value: ");
				int find = sc.nextInt(), mid = findMid(0,arr.length-1);
				for(int i=0;i<arr.length;i++){
					if(arr[mid]==find){
						match=true;
						System.out.println(mid);
						break;
					}
					else if(array.equals("asc")?arr[mid]<find:arr[mid]>find){
						mid=findMid(mid+1,arr.length-1);
					}
					else if(array.equals("asc")?arr[mid]>find:arr[mid]<find){
						mid=findMid(0,mid-1);
					}
				}
				if(!match)
					System.out.println("Value not found");
			}else
					System.out.println("Unsorted array.");
		}catch(Exception e){
			System.out.println(e);
		}
	}
	
	static int findMid(int start, int end){
		return (start+end)<2?(start+end)%2:(start+end)/2;
	}
	
	static String checkSort(int arr[]){
		int asc=0, dec=0;
		for(int i=0, j=i+1;i<arr.length && j<arr.length;i++,j++){
			if(arr[i]<arr[j]){
				asc++;
			}else if(arr[i]>arr[j]){
				dec++;
			}
		}
		if(asc==arr.length-1){
			return "asc";
		}else if(dec==arr.length-1){
			return "dec";		
		}else
			return "Unsorted array.";
	}
}