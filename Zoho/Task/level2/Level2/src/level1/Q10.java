package level1;

public class Q10 {

	public static void main(String[] args) {
		System.out.println(zoho("Zoho Corp"));
	}

	public static String zoho(String s) {
		int sp = -1;
		char[] arr = s.toCharArray();
		int l = s.length();
		for (int i = 0; i <= l; i++) { 
			if (i==l|| arr[i]==' ') {
				int j = sp + l; 
				int k=i-l; 
				while (j<k) { 
					char temp = arr[j]; 
					arr[j] = arr[k]; 
					arr[k] = temp; j++; 
					k--; 
				} 
				sp=i; 
			}
		}
		return new String(arr);
	}
}
