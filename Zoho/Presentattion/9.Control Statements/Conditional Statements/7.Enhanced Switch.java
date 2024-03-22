class EnhancedSwitch{

public static void main(String[] args){
		char charValue = 'A';

		switch (charValue) {
    		case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> System.out.println(charValue + " is a Vowel");
    		default -> System.out.println(charValue + " is a Consonant");
		};


		String result1 = switch(charValue) {
    		case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> charValue + " is a Vowel";
    		default -> charValue + " is a Consonant";
		};


		String result2 = switch(charValue) {
    		case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' :{
			 yield charValue + " is a Vowel";
		}
    		default -> {
			yield charValue + " is a Consonant";
		}
		};

		
		String result3 = switch(charValue) {
    		case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' :
			 yield charValue + " is a Vowel";
    		default:
			yield charValue + " is a Consonant";
		};


		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
}


