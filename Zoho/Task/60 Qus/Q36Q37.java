import java.util.Scanner;

public class Q36Q37{
	public static void main(String[] args) {
	
	int arr[] = {1,2,4,5,8,7};
	
	for(int i=1;i<arr.length;i++){
		if(i%2==0){
			System.out.println("Position "+i+" value is "+arr[i]);
		}
	}
	
	for(int i=1;i<arr.length;i++){
		if(i%2 != 0){
			System.out.println("Position "+i+" value is "+arr[i]);
		}
	}
	
	}
}