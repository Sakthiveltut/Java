import java.util.*;

public class Main{


	public static void main(String[] args){

		//String num = "36789";
		//String num = "589";
		//String num  = "36798";
		//String num  = "3679080";
		//String num  = "3619100";

		String num = 354;

		char numChar[] = num.toCharArray();
		
		for(int i=numChar.length-1;i>=0;i--){
			if(numChar[i] > numChar[i-1] ){
				char temp = numChar[i-1];
				numChar[i-1] = numChar[i];
				numChar[i] = temp;
				break;
			}
		}	
		
		for(char c:numChar){

			System.out.print(c);
		}	
	}
}