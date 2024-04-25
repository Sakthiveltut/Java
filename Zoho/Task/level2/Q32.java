//package level2;
import java.util.Scanner;
import java.util.Arrays;

public class Q32{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");

		int arr1[][] = {{1,2},
						{4,5}};
		
		int arr11[][] = {{1,2,3},
						{4,5,6},
						{7,8,9}};
						
		/*int arr[][] =  {{1,2,3,100},
						{4,5,6,200},
						{7,8,9,300}};*/
						
		int arr12[][] = {{00,01,02,03},
						{10,11,12,13},
						{20,21,22,23},
						{30,31,32,33}};
						
		int arr13[][] = {{00,01,02,03,04},
						{10,11,12,13,14},
						{20,21,22,23,24},
						{30,31,32,33,34},
						{40,41,42,43,44}};
						
		 int arr[][] = {{00,01,02,03,04,05},
						{10,11,12,13,14,15},
						{20,21,22,23,24,25},
						{30,31,32,33,34,35},
						{40,41,42,43,44,45},
						{50,51,52,53,54,55}};

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
		while(i<arr.length && j<arr[i].length){
			if(i==j){
				System.out.println(arr[i][j]);
				//System.out.println(i+"  "+j);
				if(i==arr.length-1 && j==arr[i].length-1)
					break;
				j++;
			}
			count1=i;count2=j;
			while(i!=j && count1<arr.length && count2<arr[i].length){
				System.out.println(arr[count1][count2]);
				if(count1==j && count2==i){
					if((count1==0 || count1==arr.length-1) && count2<arr[i].length-1){
						i=count1;j=count2+1;
					}else{
						i=count1+1;j=count2;
					}
					//System.out.println(i+"  "+j);
					break;
				}else if(i<j){
					count1++;
					count2--;
				}
				else if(i>j){
					count1--;
					count2++;
				}
			}
			//System.out.println(i+"  "+j);
		}
		
		/*int i=0, j=0;
		while(i<arr.length && j<arr[i].length){
			if(i==j){
				System.out.println(arr[i][j]);
				//System.out.println(i+"  "+j);
				if(i==arr.length-1 && j==arr[i].length-1)
					break;
				j++;
			}
			count1=i;count2=j;
			while(i!=j && count1<arr.length && count2<arr[i].length && count1>=0 && count2>=0){
				System.out.println(arr[count1][count2]);
				if(count1==arr.length-1 || count2==arr[i].length-1){
					if((count1==0 || count1==arr.length-1) && count2<=arr[i].length-1){
						i=count1;j=count2+1;
					}else{
						i=count1+1;j=count2;
					}
					//System.out.println(i+"  "+j);
					break;
				}else if(i<j){
					count1++;
					count2--;
				}
				else if(i>j){
					count1--;
					count2++;
				}
			}
			System.out.println(i+"  "+j);
		}*/
	}
}
