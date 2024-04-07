public class Q29{
	public static void main(String[] args) {
		char letter = 'a';
		
		switch(letter){
			case 'a','e','i','o','u','A','E','I','O','U' :
				System.out.println(letter+" is a vowel");
				break;
			default:
				System.out.println(letter+" is a consonant");
		}
	}
}