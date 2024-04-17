package level2;

import java.util.Scanner;
import java.util.Arrays;
import array.ArrayOperations;

public class Q35{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		int prices[] = ArrayOperations.getValues();
		
		int small=0,large=0;
		for(int i=0;i<prices.length;i++){
			if(prices[small]>prices[i]){
				small=i;
			}
		}
		if(prices.length-1==small)
			System.out.println(0);
		else{
			for(int i=small;i<prices.length;i++){
				if(large<prices[i]){
					large=i;
				}
			}
			System.out.println("Maximum profit: "+(prices[large]-prices[small]));
		}
	}
}