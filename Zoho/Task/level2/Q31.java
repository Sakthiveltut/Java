import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
import java.util.Arrays;

public class Q31{
	static int arr[] = new int[6];
	static int month[] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	static boolean date=false;
	static int count1=0;
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		for(int i=0;i<2;i++){
			System.out.println("Enter a Date: ");
			if(!addDate(sc.nextLine())){
				System.out.println("Illegal date");
				break;
			}
		}
		
		int count=0;
		int d=arr[0],m=arr[1],y=arr[2];
		
		a:
		while(y<=arr[5] && date){
			while(m<=12){
				int mon=month[m];
				if(y%4==0 && m==2){
					mon=29;
				}
				while(d<=mon){
					if(d==arr[3] && m==arr[4] && y==arr[5])
						break a;
					else
						count++;
					d++;
				}
				m++;
				d=1;
			}
			y++;
			m=1;
		}
		System.out.println(count+" days");
		
		//System.out.println(Arrays.toString(arr));
	}
	
	static boolean addDate(String dateValue){
		int count2=1;
		Pattern p=Pattern.compile("^([1-9]|[0][1-9]|[1-2][0-9]|[3][0-1])[-|.|/]([1-9]|[0][1-9]|[1][0-2])[-|.|/]([1-9][0-9][0-9][0-9])$");
		Matcher m=p.matcher(dateValue);

		if(m.find())
			date=true;
		else{
			date=false;
			return false;
		}
		
		if(date){
			int da=Integer.parseInt(m.group(1));
			int mon=Integer.parseInt(m.group(2));
			int ye=Integer.parseInt(m.group(3));
			if((ye%4==0 && mon==2 && da<=29) || da<=month[mon]){
				arr[count1++]=da;
				arr[count1++]=mon;
				arr[count1++]=ye;
			}else{
				date=false;
				return false;
			}
		}
		return true;
		//System.out.println(Arrays.toString(arr));
	}
}
