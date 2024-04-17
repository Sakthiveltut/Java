import java.util.Scanner;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Q33{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String input = sc.next();
		int count=1;
		
		Pattern p = Pattern.compile("^[a-zA-Z0-9]+$");
		Matcher m = p.matcher(input);
		
		if(m.find()){
			char arr[] = input.toCharArray();
			for(int h=0;h<count;h++){
				for(int i=0;i<arr.length;i++){
					for(int j=i+1;j<arr.length;j++){
						if(Character.toLowerCase(arr[i])==Character.toLowerCase(arr[j])){
								if('z'==arr[j] || 'Z'==arr[j]){
									arr[j]=(char)((int)arr[j]-25);
								}else if('9'==arr[j]){
									arr[j]=(char)((int)arr[j]-9);
								}else if(Character.isAlphabetic(arr[j]) || Character.isDigit(arr[i])){
									arr[j]=(char)((int)arr[j]+1);
								}
							count++;
						}
					}
				}
			}
			System.out.println(Arrays.toString(arr));
		}else
			System.out.println("Invalid input.");
			
	}
}