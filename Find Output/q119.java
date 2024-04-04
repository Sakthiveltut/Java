class Test {
public static void main(String args[])
    {
        try {
            int x = 5 / 0;
        }
        catch (Exception e) {
            System.out.print("Exception ");
        }
        catch (ArithmeticException e) {
            System.out.print("ArithmeticException ");
        }
        System.out.println("Last Line");
    }
}