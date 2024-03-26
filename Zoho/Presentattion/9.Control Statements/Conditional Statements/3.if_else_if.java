public class Main{
	public static void main(String[] args){
		int score = 52;
		
		//if else if statements
		if(score > 90){
			System.out.println("Grade A");
		}else if(score > 80){
			System.out.println("Grade B");
		}else if(score > 70){
			System.out.println("Grade C");
		}else if(score > 60){
			System.out.println("Grade D");
		}else if(score > 50){
			System.out.println("Grade E");
		}else{
			System.out.println("You are Fail");
		}


		//nested if else if statements
		if(score > 50){
			System.out.println("You are passed the exam");
			if(score > 90){
				System.out.println("Grade A");
			}else if(score > 80){
				System.out.println("Grade B");
			}else if(score > 70){
				System.out.println("Grade C");
			}else if(score > 60){
				System.out.println("Grade D");
			}else if(score > 50){
				System.out.println("Grade E");
			}
		}
		else if(score <= 50)
			System.out.println("You are Fail");

		
		boolean b = true; 
		if (b = true) { 
        	//if (b = false) { 
            		System.out.println("mosesh"); 
        	} else { 
            		System.out.println("rahul"); 
        	} 	
		String name = "madan";
		System.out.println(b = true); 
		System.out.println(b = false); 
		System.out.println(score = 20);
		System.out.println(name = "sakthi");
			
	}
}