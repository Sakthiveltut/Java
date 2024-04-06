import java.util.*;

public class Main{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a String1: ");
		String str1 = sc.nextLine();
		System.out.println("Enter a String2: ");
		String str2 = sc.nextLine();
		
		//System.out.println(isSubString(str1,str2));
		System.out.println(str1.indexOf(str2));
	}
	static int isSubString(String str1, String str2){
		
		char str1Array[] = str1.toCharArray();
		char str2Array[] = str2.toCharArray();
		
		int count = 0, count1 = 0, count2 = str2Array.length-1;
		for(int i=0;i<str1Array.length;i++){
			if(str1Array[i]==str2Array[count]){
				count++;
			}
			if(count == str2.length()){
				count1=i;
				while(true){
					if(count2>=0){
						System.out.println(count2+" "+str1Array[count1]+" "+str2Array[count2]);
						if(str1Array[count1]==str2Array[count2]){
							--count1;
							--count2;
						}else
							break;
					}else if(count2 == -1){
						return i-(str2.length()-1);
					}else
						break;
				}
			}
		}
		return -1;
	}
	
	
	
}

