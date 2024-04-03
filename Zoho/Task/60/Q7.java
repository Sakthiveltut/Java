import java.util.*;

public class Q7{
	public static void main(String[] args){
		
		String num = "12345",space1 = "", space2 = "";
		
		char numChar[] = num.toCharArray();
		
		float numLength = num.length();
		float mid = numLength/2;

		
		/*for(int i=0;i<numChar.length;i++){
			for(int j=i;j<numChar.length;j++){
				System.out.print(" ");
			}
			System.out.println(numChar[i]);
		}*/
		
		
		/*for(int i=0;i<numChar.length;i++){
			for(int j=i;j<Math.round(mid);j++){
					if(Math.round(mid)<i){
						break;
					}
					System.out.print(numChar[i]);
			}
			System.out.println();
			for(int j=i;j>=Math.round(mid)-1;j--){
					System.out.print(numChar[i]);
			}
			System.out.println();
		}*/
		
		/*for(int i=0;i<numChar.length;i++){
			for(int j=i;j>=0;j--){
				space1+=" ";
			}
			for(int j=i;j<numChar.length;j++){
				space2+=" ";
			}
			System.out.print(space1+numChar[i]+space2+numChar[i]);
			space1 = "";
			space2 = "";
			System.out.println();
		}*/
		
		/*for(int i=0;i<numChar.length;i++){
			for(int j=i;j>=0;j--){
				space1+=" ";
			}
			System.out.print(space1+numChar[i]);
			space1 = "";
			space2 = "";
			System.out.println();
		}*/
		
		
		
		for(int i=0;i<numChar.length;i++){
			for(int j=i;j>=0;j--){
				System.out.print(" ");
			}
			System.out.print(numChar[i]);
			for(int j=i;j<numChar.length;j++){
				System.out.print(" ");
			}
			System.out.println(numChar[i]);
			/*for(int j=i;j<numChar.length;j++){
				System.out.print("");
			}
			System.out.println(numChar[i]);*/
		}
	}
}

