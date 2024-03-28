import java.util.*;

public class Main {
 	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		
		//int arr[]  = {49, 1, 3, 200, 2, 4, 70, 5};
		//int arr[]  = {49, 1, 3, 6, 2, 4, 70, 50,71,51,72,52,53};
		int arr[]  = {49, 1, 3, 6, 2, 4, 70, 50,71,51,72,52,53,73,74};
			
		Arrays.sort(arr);
		
		for(int a: arr){
			System.out.print(a+" ");
		}
	
		/*for(int i=0;i<1;i++){
	
			for(int j=0;j<arr.length;j++){
				
				//System.out.println(arr[j]);
					
				System.out.println((arr[j]+1)+" "+arr[j+1]);

				if(arr[j]==arr[j]-1){
					list.add(arr[j]);
					
				}
			}
		}*/

		int count = arr[0], arrLength = 0;
		for(int i=0;i<arr.length;i++){
			
			if(count == arr[i]){
				list.add(count);
				count++;
			}else {
				if(list.size() > arrLength){
					arrLength = list.size();
					System.out.println(list);
					list.clear();
				}
				System.out.println("count "+count);
				count = arr[i+1];
				System.out.println("arr "+count);
			}
		
		}
		System.out.println("Length is "+arrLength);

 	}
}
