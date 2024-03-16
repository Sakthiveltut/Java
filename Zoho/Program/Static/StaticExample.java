class Parent {
    static void parentMethod() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    
}

public class StaticExample {
    public static void main(String[] args) {
	Child.parentMethod();
	//parentMethod();  //cannot find symbol
    }
}


