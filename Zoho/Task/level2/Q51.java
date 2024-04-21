import java.util.Scanner;
import java.util.Arrays;

public class Q51{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int arr1[][] = {{1, 0, 1, 0, 0 },
					   {1, 1, 1, 1, 1 },
					   {0, 0, 0, 1, 0 },
					   {1, 0, 1, 1, 1 },
					   {0, 1, 1, 0, 1 }};
					   
		int arr[][] = {{1, 1, 1, 1, 1 },
					   {1, 0, 1, 0, 0 },
					   {1, 1, 0, 1, 0 },
					   {0, 1, 0, 1, 0 },
					   {0, 1, 0, 1, 1 }};
					   
		int arr3[][] = {{1, 0, 1, 1, 1 },
					   {1, 0, 1, 0, 1 },
					   {1, 0, 1, 0, 1 },
					   {1, 0, 1, 0, 1 },
					   {1, 1, 1, 0, 1 }};
					   
		int dimention = (arr.length-1)*10+(arr[0].length-1);
		int size = (arr.length)*(arr[0].length);
		int route[] = new int[size], count=0;

		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(arr[i][j]==1){
					route[count++]=i*10+j;
				}
			}
		}
		System.out.println(Arrays.toString(route));
		int temp[] = new int[25];
		count = -1;
		a:
		for(int i=0;i<route.length;i++){
			for(int j=i+1;j<route.length;j++){
				if(route[i]+1==route[j] || route[i]+10==route[j]){
					System.out.println(i+" "+j);
					
					System.out.println(route[j]);
					if(route[j]==dimention){
						System.out.println("Yes");
						break a;
					}
					temp[++count]=i;
					i=j-1;
					break;
				}else if(j==route.length-1){
					System.out.println("i "+i);
					route[i]=0;
					if(count==-1){
						System.out.println("No");
						break a;
					}
					i=temp[count--]-1;
				}
				else if(i==route.length-1)
				System.out.println("No");
				//System.out.println(Arrays.toString(temp));
				//System.out.println(Arrays.toString(route));
			}
		}		
		System.out.println(Arrays.toString(route));

		/*int r=0, c=0;
		while(true){
			while(true){
				if(r<arr.length && c<arr.length && arr[r][c]==1)
					c++;
				else{
					c--;
					r++;
					break;
				}
			}
			while(true){
				if(r<arr.length && c<arr.length && arr[r][c]==1)
					r++;
				else
					r--;
					break;
			}
		}*/
		
		/*for(int i=0;i<route.length;i++){
			if(route[i]+1!=route[i+1] || route[i]+10!=route[i+10]){
				
			}else{
				route[i+1]=0;	
				for(int j=i;j<route.length;j++){
					route[j]=route[j]+route[j+1];
					route[j+1]=route[j]-route[j+1];
					route[j]=route[j]-route[j+1];
				}
				i=0;
			}
		}*/
	}
}
