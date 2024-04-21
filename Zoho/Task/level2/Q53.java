import java.util.Arrays;

public class Q53{
	public static void main(String[] args){
		
		int arr[][] = {{1, -1, -1, 1 },
					   {-1, -1, 1, -1 },
					   {-1, 1, -1, -1},
					   {-1, -1, -1, 1 }};
					   
		int dimention = (arr.length-1)*10+(arr[0].length-1);
		int size = (arr.length)*(arr[0].length);			   
					   
		int land[] = new int[size], count=0;
					   
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(arr[i][j]==1 && i!=0 && i!=arr.length-1 && j!=0 && j!=arr.length-1){
					land[count++]=i*10+j;
				}
			}
		}
		for(int i=0;i<land.length;i++){
			count=0;
			for(int j=i+1;j<land.length;j++){
				if(land[i]+1==land[j] || land[i]+10==land[j] || land[i]-1==land[j] || land[i]-10==land[j]){
					count++;
				}
			}
			if(count==0 && land[i]!=0){
				System.out.println("Iland is "+land[i]);
			}
		}
		//System.out.println(Arrays.toString(land));
	}
}
