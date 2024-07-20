public class Main {
    public static void main(String[] args) {
        D d = new D();
        d.display(); 
    }
}

interface IB {
    default void display() {
        System.out.println("interface IB");
    }
}

interface IC {
    default void display() {
        System.out.println("interface IC");
    }
}

abstract class AB implements IB {
    @Override
    public void display() {
        System.out.println("Abstract class AB implementation");
    }
}

class D extends AB implements IC {
    @Override
    public void display() {
        super.display(); // Calls AB's implementation
        IC.super.display(); // Calls IC's default implementation
    }
}
