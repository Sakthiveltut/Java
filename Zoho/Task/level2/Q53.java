import java.util.Arrays;

public class Q53{
	public static void main(String[] args){
		
		int arr[][] = {{-1, -1, -1, -1 },
					   {-1, -1, -1, -1 },
					   {-1, -1, 1, -1},
					   {-1, -1, -1, -1}};
					   
		/*int dimention = (arr.length-1)*10+(arr[0].length-1);
		int size = (arr.length)*(arr[0].length);			   
					   
		int land[] = new int[size], count=0;
					   
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(i!=0 && i!=arr.length-1 && j!=0 && j!=arr.length-1 && arr[i][j]==1){
					land[count++]=i*10+j;
				}
			}
		}
		System.out.println(Arrays.toString(land));
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
		}*/
		
		
		int count=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				if(i!=0 && i!=arr.length-1 && j!=0 && j!=arr.length-1 && arr[i][j]==1){
					if(arr[i-1][j]==-1 && arr[i+1][j]==-1 && arr[i][j-1]==-1 && arr[i][j+1]==-1){
						count++;
						System.out.println(i+","+j+" is an Iland");
					}
				}
			}
		}
		if(count==0){
			System.out.println("Iland not found.");
		}
	}
}
