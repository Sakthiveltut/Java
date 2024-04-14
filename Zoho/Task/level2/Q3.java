import java.util.Scanner;
import java.util.Arrays;

public class Q3{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");

		String sentence = sc.nextLine();
		String arr[] = sentence.split(" ");
		
		
		/*int count=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-count;j++){
				if(i!=j && arr[i].equals(arr[j])){
					String temp = arr[arr.length-count-1];
					arr[arr.length-count-1]=arr[j];
					arr[j]=temp;
					count++;
					System.out.println(Arrays.toString(arr));
				}
			}
		}
		*/
		/*int count=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(i!=j && arr[i].equals(arr[j]))
					count++;
				
				if(j==arr.length-1 && count>0){
					System.out.println(arr[i]+" "+count);
				}
			}
			count = 0;
		}*/
		int count=0, result=0;
		String temp[] = new String[arr.length];
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<=i;j++){
				if(i!=j && arr[i].equals(temp[j])){
					break;
				}
				if(j==i){
					temp[count++]=arr[i];
				}
			}
		}
		System.out.println(Arrays.toString(temp));

		count=0;
		for(int i=0;i<temp.length;i++){
			for(int j=0;j<arr.length;j++){
				if(temp[i]!=null && temp[i].equals(arr[j])){
					count++;
				}
			}
			if(count>1){
				result+=count-1;
				System.out.println(temp[i]+" "+(count-1));
			}
			count=0;
		}
		System.out.println("Total duplicates: "+result);
	}
}