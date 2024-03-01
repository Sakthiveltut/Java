final class MathOperations {
    private MathOperations() {
        // Private constructor to prevent instantiation
    }

    // Static method to calculate the square of a number
    public static double square(double number) {
        return number * number;
    }

    // Static method to calculate the cube of a number
    public static double cube(double number) {
        return number * number * number;
    }

    // Static method to calculate the factorial of a number
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}

// Attempting to create a subclass will result in a compilation error
/*
class ExtendedMathOperations extends MathOperations {
    // Compilation error: Cannot inherit from final 'MathOperations'
}
*/

public class FinalClass{
    public static void main(String[] args) {
        double squareResult = MathOperations.square(5.0);
        double cubeResult = MathOperations.cube(3.0);
        int factorialResult = MathOperations.factorial(4);

        System.out.println("Square of 5: " + squareResult);
        System.out.println("Cube of 3: " + cubeResult);
        System.out.println("Factorial of 4: " + factorialResult);
    }
}
