//package level2;
import java.util.Scanner;
import java.util.Arrays;

public class Q32{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int arr[][] = {{1,2,3},
						{4,5,6},
						{7,8,9}};

		int count1=0, count2=0;
		/*for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(i==j){
					System.out.println(arr[i][j]);
				}
				count1=i;count2=j;
				while(i<j){
					System.out.println(arr[count1][count2]);
					if(count1==j && count2==i){
						System.out.println("hello");
						j=count1;i=count2;
						break;
					}else if(i<j){
						count1++;
						count2--;
					}
				}
				while(i>j){
					System.out.println(arr[count1][count2]);
					if(count1==j && count2==i){
						System.out.println("hello");
						j=count1;i=count2;
						break;
					}else if(i>j){
						count1--;
						count2++;
					}
				}
			}
		}*/
		
		int i=0, j=0;
		//while(true){
			if(i==j){
				System.out.println(arr[i][j]);
			}
			j++;
			count1=i;count2=j;
			while(i<j){
				System.out.println(arr[count1][count2]);
				if(count1==j && count2==i){
					i=count1+1;j=count2;
					break;
				}else if(i<j){
					count1++;
					count2--;
				}
			}
			/*while(i>j){
				System.out.println(arr[count1][count2]);
				if(count1==j && count2==i){
					j=count1;i=count2;
					break;
				}else if(i>j){
					count1--;
					count2++;
				}
			}*/
		//}
	}
}

