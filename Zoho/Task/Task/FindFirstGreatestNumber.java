import java.util.*;

public class Main{


	public static void main(String[] args){

		//String num = "36789";
		//String num = "589";
		//String num  = "36798";
		//String num  = "3679080";
		//String num  = "3619100";

		//String num = "354";
		//String num = "9354";
		//String num = "654";

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		String num = sc.next();
		
		char numChar[] = num.toCharArray();
		int count = 0;
		char temp;
		
		for(int i=numChar.length-1;i>=0;i--){
						System.out.println("i "+i);

			if(i>0 && numChar[i] > numChar[i-1]){
				temp = numChar[i-1];
				numChar[i-1] = numChar[i];
				numChar[i] = temp;
				System.out.println(i+" "+Arrays.toString(numChar));
				break;
			}
			else if(i>1 && numChar[i] > numChar[i-2]){
				temp = numChar[i-2];
				numChar[i-2] = numChar[i];
				numChar[i] = temp;
				//System.out.println(Arrays.toString(numChar));
				if(numChar[i] < numChar[i-1]){
					temp = numChar[i-1];
					numChar[i-1] = numChar[i];
					numChar[i] = temp;
					break;
				}	
			}
			if(i==1){
				Arrays.sort();
			}
		}

		for(char c:numChar){
			System.out.print(c);
		}	
	}
}
/*8931
9831

94321
94321

89444321
98444321*/
