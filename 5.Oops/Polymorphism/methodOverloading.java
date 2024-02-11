class MathOperation {
    public static int multiply(int a, int b) {
        return a * b;
    }
    public static double multiply(double x, double y) {
        return x * y;
    }
    public static double multiply(double i, int j) {
        return i * j;
    }
    public static int multiply(int r) {
        return r*r;
    }
}
public class methodOverloading {
    public static void main(String arg[]) {
        System.out.println("Multiply 2 Integer Value : " + MathOperation.multiply(25, 10));
        System.out.println("Multiply 2 Double Value : " + MathOperation.multiply(2.5, 8.5));
        System.out.println("Multiply Double & Integer Value : " + MathOperation.multiply(2.5, 8));
        System.out.println("Multiply Integer Value : " + MathOperation.multiply(2));
    }
}