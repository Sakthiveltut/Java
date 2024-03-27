import java.util.Scanner;

public class For_loop {
	
	public static void main(String args[]) {
    		System.out.println("Enter The Limit : ");
    		Scanner in = new Scanner(System.in);
    		int n = in.nextInt();
	
    		/*for (int i = 1; i <= n; i++) {
      			System.out.println(i);
   		}*/



		/*for(int i = 1;true; i++) {
      			System.out.println(i);
   		}
		for(int i = 1;; i++) {
      			System.out.println(i);
   		}
		for(;;) {
      			System.out.println(i);
   		}*/
		


		/*for(;n<100;) {
      			System.out.println(n);
			n++;
   		}*/



		/*for(int i=1,j=11;i<11 && j<21;i++,j++){
			System.out.println(i+" "+j);
		}*/


		for(int i = 0 ; i <= 10 ; i++);

		

		/*for (int i = 1; i <= n; i++) {
      			System.out.println(i);
   		}*/
		

		/*for (int i = 1; i <= n; i++)
			int a = 10;
			//System.out.println(i);
			//System.out.println(i);*/


		/*int i = 10;
		for (System.out.println("hello"); i < 11; i++) {
      			System.out.println("zoho");
   		}*/


	        /*//final int a = 1, b = 5; 
		int a = 1, b = 5; 
  
        	for (int i = 0; a < b; i++) { 
            		System.out.println("Hello"); 
        	} 
        	System.out.println("Hi");*/ 

		

		/*int i = 10;
		for (System.out.println("mosesh");i < 11; System.out.println("rahul")) {
      			System.out.println("madan");
			if(i == 12)
				int a =10;
			i++;
   		}*/

		

		int i = 10;
		for (method1();method2(); method1()) {
      			System.out.println("madan");
			if(i == 12)
				break;
			i++;
   		}

  	}

	static void method1(){
		System.out.println("method1");
	}
	static boolean method2(){
		System.out.println("method2");
		return true;
	}
}
