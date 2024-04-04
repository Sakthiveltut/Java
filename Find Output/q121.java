public class Main {
	public static void main(String[] args) {
		int arr[] = {5,2,6,7,9};
		System.out.println(arr);
		arr = null;
		System.out.println(arr);
		for(int a : arr){
				System.out.println(a);
		}
	}
}