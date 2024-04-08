import java.util.*;

public class Q53{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value: ");
		String input = sc.nextLine();
		int num = 0;
		String numTemp="", alphabeticTemp="", result="";
		boolean alphabetic = true;
		char inputArr[] = input.toCharArray();
		for(int i=0;i<=inputArr.length;i++){
			if(i<inputArr.length && Character.isAlphabetic(inputArr[i]) && alphabetic){
				alphabeticTemp = ""+inputArr[i];
				alphabetic = false;
			}else if(i<inputArr.length && Character.isDigit(inputArr[i])){
				numTemp+=""+inputArr[i];
			}else{
				if(!numTemp.isEmpty()){                 //NumberFormatException:
					num = Integer.parseInt(numTemp);
					for(int j=0;j<num;j++){
						result+=alphabeticTemp;
					}
					alphabetic = true;
					alphabeticTemp="";
					numTemp="";
					if(i==inputArr.length)
						break;
					i--;
				}
			}
		}
		System.out.println(result);
	}
}

