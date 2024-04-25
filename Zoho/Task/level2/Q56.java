import java.util.Arrays;
import java.util.Scanner;

public class Q56{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		int num = sc.nextInt();
		int length=String.valueOf(num).length(),size=(int)Math.pow(2,length), sum=0;
		
		String digits1 = "", digits2 = "";
		boolean asign = true;
		
		int arr[] = new int[size], count=0;
		arr[0]=1;
		for(int i=0;i<size;i++){
			int value = arr[i]*10;
			if(num>=value){
			arr[++count]=value;
			}else
				break;
			value=arr[i]*10+1;
			if(num>=value){
				arr[++count]=value;
			}else
				break;
		}
		
		System.out.println(Arrays.toString(arr));
		a:
		for(int h=arr.length-1;h>=0;h--){
			for(int i=h;i>=0;i--){
				if(arr[i]==num){
					System.out.println(arr[i]);
					break a;
				}
				while(arr[i]!=0){
					if(sum<num){
						sum+=arr[i];
					}
					if(sum>num){
						sum-=arr[i];
						break;
					}else
						digits1+=arr[i]+"+";
					if(sum==num){
						System.out.println(digits1);
						if(asign){
							digits2=digits1;
							asign=false;
						}else if(digits1.length()<digits2.length()){
							digits2=digits1;
						}
						sum=0;
						digits1="";
						break;
					}
				}
			}
		}
		System.out.println(digits2);
	}
}



/*

0       1  
1        9

10      1
11     89

100    1  1000   1001
101    9   1010   1011
110    1    1100   1101
111    889  1110  1111

1000  1
1001   9
1010   1
1011   1
1100    89
1101   1
1110    9
1111    889
*/