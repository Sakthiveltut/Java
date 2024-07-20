public final class FinalClass {
    private final String name;

    public FinalClass(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void display() {
        System.out.println("Display method from FinalClass");
    }
}
public class Main {
    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass("Example");
        finalClass.display();
        System.out.println("Name: " + finalClass.getName());
    }
}
