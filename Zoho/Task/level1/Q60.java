public class Main {
	public static void main(String[] args) {
		int num = 5, result = 0;
		String temp = "";
		for(int i=1;i<=num;i++){
			for(int j=i;j>=1;j--){
				temp+="1";
				System.out.print(1);
			}
			System.out.println();
			result += Integer.parseInt(temp); 
			temp = "";
		}
		System.out.println(result);
	}
}