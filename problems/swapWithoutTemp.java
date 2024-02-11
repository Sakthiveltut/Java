public class swapWithoutTemp {
    public static void main(String[] args) {
        int a = 590;
        int b = 10897695;

        // Swap without using a temporary variable
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
