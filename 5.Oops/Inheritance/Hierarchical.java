class shape {
    float length, breadth, radius;
}
class rect extends shape {
    public rect(float l, float b) {
        length = l;
        breadth = b;
    }
    float rectangle_area() {
        return length * breadth;
    }
}
class circle extends shape {
    public circle(float r) {
        radius = r;
    }
    float circle_area() {
        return 3.14f * (radius * radius);
    }
}
class square extends shape {
    public square(float l) {
        length = l;
    }
 
    float square_area() {
        return (length * length);
    }
}
 
 
public class Hierarchical {
    public static void main(String[] args) {
 
        rect o1 =new rect(2,5);
        System.out.println("Area of Rectangle : "+o1.rectangle_area());
 
        circle o2 =new circle(5);
        System.out.println("Area of Circle : "+ o2.circle_area());
 
        square o3 =new square(3);
        System.out.println("Area of Square : "+o3.square_area());
 
    }
}