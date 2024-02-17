public class preandpost {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("Initial value of 'a': " + a);
        
        int resultPreIncrement = ++a;
        // a++;
        System.out.println("After pre-increment, 'a': " + a);
        System.out.println("Result of pre-increment: " + resultPreIncrement);
        System.out.println(); 

        int b = 5;
        System.out.println("Initial value of 'b': " + b);
        
        int resultPostIncrement = b++;
        System.out.println("After post-increment, 'b': " + b);
        System.out.println("Result of post-increment: " + resultPostIncrement);
    }
}
