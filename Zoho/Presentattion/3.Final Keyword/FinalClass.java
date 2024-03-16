final class MathOperations {

	int a =10;
    /*private MathOperations() {
        // Private constructor to prevent instantiation
    }*/

    public static double square(double number) {
        return number * number;
    }

    public static double cube(double number) {
        return number * number * number;
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    	static void check(){
		MathOperations mo = new MathOperations();
		System.out.println(mo.square(10));
		System.out.println(mo.cube(5));
	}

}

/*
class ExtendedMathOperations extends MathOperations {
    // Compilation error: Cannot inherit from final 'MathOperations'
}
*/

public class FinalClass{
    public static void main(String[] args) {

        //System.out.println("Square of 5: " + MathOperations.square(5.0));
        //System.out.println("Cube of 3: " + MathOperations.cube(3.0));
        //System.out.println("Factorial of 4: " + MathOperations.factorial(4));

	MathOperations.check();
	
	MathOperations mo = new MathOperations();
	mo.a = 20;
	System.out.println(mo.a);
	mo.check();

	/*MathOperations mo1 = new MathOperations(){
		public double square(double num){
			System.out.println(num);
		}	
	};*/
	
    }
}
