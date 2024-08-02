package level1;

public class Q13 {

	public static void main(String[] args) {
		System.out.println(zoho(new String[] {"flower","flow","flight"}));
	}
	
	public static String zoho(String[] strs) {
		String temp = strs[0]; 
		for (int i = 1; i < strs.length; i++)
			while (strs[i].indexOf(temp) != 0) { 
				temp = temp.substring(0, temp.length() - 1); 
				if (temp.isEmpty()) return "";
			}
		return temp;
	}

}
