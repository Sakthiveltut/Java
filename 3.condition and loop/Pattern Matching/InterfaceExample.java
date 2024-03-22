interface Shape {
    double area();
}

class Circle implements Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }
}

public class InterfacePatternMatchingExample {
    public static void main(String[] args) {
        Shape shape = new Circle(5);

        double result = switch (shape) {
            case Circle c -> c.area();
            case Rectangle r -> r.area();
            default -> 0;
        };

        System.out.println("Area: " + result);
    }
}
