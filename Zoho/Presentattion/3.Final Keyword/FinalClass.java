public class FinalClass{
    public static void main(String[] args) {

        //System.out.println("Square of 5: " + MathOperations.square(5.0));
        //System.out.println("Cube of 3: " + MathOperations.cube(3.0));
        //System.out.println("Factorial of 4: " + MathOperations.factorial(4));

		//MathOperations.check();
		
		MathOperations mo = new MathOperations();
		mo.a = 20;
		System.out.println(mo.a);
		mo.check();
		
		ExtendedMathOperations object = new ExtendedMathOperations();
		object.operation.check();
    }
}

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

    void check(){
		MathOperations mo = new MathOperations();
		System.out.println(mo.square(10));
		System.out.println(mo.cube(5));
		a=20;
	}

}


class ExtendedMathOperations {

	MathOperations operation = new MathOperations(){
		void check(){
			System.out.println("Override method");
		}
	};
}

