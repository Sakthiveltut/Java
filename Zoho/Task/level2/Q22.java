public class Q22{
	public static void main(String[] args) {
		int arr[] = {10,20,30,40,50,60,70,80,90};
		int find = 20,mid=arr.length/2, length=0;
		//first sort
		for(int i=0;i<arr.length;i++){
			length=arr.length-mid;
		if(arr[mid]==find){
			System.out.println(mid);
			break;
		}
		else if(arr[mid]<find){
			mid+=length/2;
			System.out.println("2 "+mid);
		}
		else if(arr[mid]>find){
			mid-=length/2;
			System.out.println("3 "+mid);
		}
		}
	}
}