package level2;

import java.util.Scanner;
import java.util.Arrays;
import array.ArrayOperations;

public class Q37{
	
	static int sum=0,mul=0;
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		int arr[] = ArrayOperations.getValues();
		
		//int arr[] = {120,24,71,10,59};
		for(int i=0;i<arr.length;i++){
			reverse(arr[i]);
			System.out.print(mul>sum?mul+" ":sum+" ");
		}
	}
	static void reverse(int num){
		int rem=0, rev=0;
		sum=0;mul=1;
		while(num>0){
			rem=num%10;
			sum+=rem;
			mul*=rem;
			num/=10;
		}
	}
}