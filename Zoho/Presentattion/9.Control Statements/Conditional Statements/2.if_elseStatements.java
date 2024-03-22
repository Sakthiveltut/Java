public class Main{
	public static void main(String[] args){
		int score = 92;
		
		//if else statements
		if(score > 50){
			System.out.println("You are passed the exam");
		}
		else{
			System.out.println("You are Fail");
		}


		//nested if else statements
		if(score > 50){
			System.out.println("You are passed the exam");
			if(score > 90)
				System.out.println("Grade A");
			else
				System.out.println("Grade B");
		}
		else
			System.out.println("You are Fail");	
			
	}
}