abstract class Shape
{
    abstract void draw();
	abstract void area();
    void message()
    {
        System.out.println("Message From Shape");
    }
}
class rectangleShape extends Shape
{
    @Override
    void draw() {
        System.out.println("Draw Rectangle Using Length & Breadth..");
    }
	void area() {
        System.out.println("Draw Rectangle Using Length & Breadth..");
    }
}
 
public class abstractClass {
    public static void main(String args[]) {
        rectangleShape o =new rectangleShape();
        o.draw();
        o.message();
    }
}