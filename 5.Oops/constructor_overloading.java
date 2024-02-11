class Box {

  float length, breadth;

  public Box() { //Default
    length = 2;
    breadth = 5;
  }

  public Box(float x, float y) { //Parameterized
    length = x;
    breadth = y;
  }

  Box(float x) {
    length = breadth = x;
  }

  float area() {
    return length * breadth;
  }
}

public class constructor_overloading {

  public static void main(String args[]) {
    Box o = new Box();
    System.out.println("Area : " + o.area());

    Box o1 = new Box(3, 6);
    System.out.println("Area : " + o1.area());

    Box o2 = new Box(3);
    System.out.println("Area : " + o2.area());
  }
}
