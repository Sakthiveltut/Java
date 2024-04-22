public class Q21{
	public static void main(String[] args) {
		//int arr[] = {10,20,30,40,50,60,70,80,90};
		for(int i=0;i<arr.length;i++){
			if(find==arr[i]){
				System.out.println(find+" is "+i+" index");
				break;
			}
			else if(i==arr.length-1)
				System.out.println(find+" not exits");
		}
	}
}