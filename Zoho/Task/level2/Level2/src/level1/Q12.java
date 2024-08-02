package level1;

public class Q12 {

	public static void main(String[] args) {
		System.out.println(zoho("ZohoForLife","HappyWorkHappyLife"));
	}
	
	public static int zoho(String str1, String str2) {
		int num = 0;
		for (int i = 0; i < str2.length(); i++)
		if(str1.indexOf(str2.charAt(i)) != -1)
		num++;
		return num;
	}

}
