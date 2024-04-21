import java.util.Scanner;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Q44{
	static int count = 0;
	static int num[] = new int[6];

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a two versions: ");
		String versions = sc.nextLine();
		//Pattern p = Pattern.compile("^[\\w]+\\s[0-9]+\\.[0-9]+\\.[0-9]+\\s[\\w]+\\s[0-9]+\\.[0-9]+\\.[0-9]+$");
		Pattern p = Pattern.compile("^(?i)version[0-9]{1,2}\\s[0-9]+\\.[0-9]+\\.[0-9]+\\s(?i)version[0-9]{1,2}\\s[0-9]+\\.[0-9]+\\.[0-9]+$");
		Matcher m = p.matcher(versions);
		
		if(m.find()){
			String arr[] = versions.split(" ");

			checkVersion(arr[1]);
			checkVersion(arr[3]);
			for(int i=0;i<num.length/2;i++){
				if(num[i]<num[i+3]){
					System.out.println("Upgrade");
					break;
				}
				else if(num[i]>num[i+3]){
					System.out.println("Downgrade");
					break;
				}else if(i==(num.length/2)-1)
					System.out.println("Same");				
			}	
		}else
			System.out.println("Invalid input.");
	}		
	//System.out.println(Arrays.toString(num));

	static void checkVersion(String version){
		Pattern p = Pattern.compile("^([0-9]+)\\.([0-9]+)\\.([0-9]+)$");
		Matcher m = p.matcher(version);
		if(m.find()){
			num[count++] = Integer.parseInt(m.group(1));
			num[count++] = Integer.parseInt(m.group(2));
			num[count++] = Integer.parseInt(m.group(3));
		}

	}
}