class RectangleShape {
    int length, width;
 
    public RectangleShape() {
        System.out.println("Constructor Called");
        length=2;
        width=10;
    }
 
    int area() {
        int a = length * width;
        return a;
    }
}
 
public class constructor {
    public static void main(String args[]) {
        RectangleShape o1 = new RectangleShape();
        System.out.println("Area of Rectangle : " + o1.area());
 
    }
}