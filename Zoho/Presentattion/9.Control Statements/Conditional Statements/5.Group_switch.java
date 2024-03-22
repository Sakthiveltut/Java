import java.util.Scanner;

public class Group_switch {
    public static void main(String args[]) {
       	char charValue;
        System.out.println("Enter The Character : ");
        Scanner in =new Scanner(System.in);
        charValue=in.next().charAt(0);

	if((charValue >= 'a' && charValue <= 'z') || (charValue >= 'A' && charValue <= 'Z')){ 
        	/*switch (charValue) 
        	{
            		case 'a':
            		case 'e':
            		case 'i':
            		case 'o':
            		case 'u':
            		case 'A':
            		case 'E':
            		case 'I':
            		case 'O':
            		case 'U':
                		System.out.println(charValue + " is a Vowels");
                		break;
            		default:
                		System.out.println(charValue + " is Consonant");
        	}*/

		switch(charValue)
		{
			case 'a','e','i','o','u','A','E','I','O','U': 
				System.out.println(charValue + " is a Vowels");
				break;
			default: 
				System.out.println(charValue + " is Consonant");
		}

	}else
		System.out.println("Enter only character");
    }
}