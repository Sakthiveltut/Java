import java.util.*;

public class Q5{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a array size: ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		for(int i=0;i<size;i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter a rotate value: ");
		int rotate = sc.nextInt();
		
		for(int h=0;h<rotate;h++){
			for(int i=0;i<arr.length-1;i++){
					arr[i] = arr[i]+arr[i+1];
					arr[i+1]=arr[i]-arr[i+1];
					arr[i]=arr[i]-arr[i+1];
			}
		}
		System.out.println("Left "+rotate+" Rotation: "+Arrays.toString(arr));		
		
		for(int h=0;h<rotate;h++){
			for(int i=arr.length-1;i>0;i--){
					arr[i] = arr[i]+arr[i-1];
					arr[i-1]=arr[i]-arr[i-1];
					arr[i]=arr[i]-arr[i-1];
			}
		}
		System.out.println("Right "+rotate+" Rotation: "+Arrays.toString(arr));		
	}
}

