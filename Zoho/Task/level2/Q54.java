//package level2;
import java.util.Scanner;
import java.util.Arrays;

public class Q54{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int arr[] = {1,2,3,4,5,6}, start=3, skip=6, pos=0;
		for(int i=0;i<arr.length;i++){
			pos = start+skip-1;
				System.out.println(pos);
			
			while(pos>=arr.length){
				pos=pos-arr.length;
				if(pos<arr.length){
					break;
				}
			}
			arr[pos]=0;
			start++;
			System.out.println("skip "+skip);
			System.out.println(Arrays.toString(arr));
		}
	}
}

