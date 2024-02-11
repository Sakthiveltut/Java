public class superKeyword {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.display();
    }
}

class Animal {
    String name = "Animal";

    Animal() {
        System.out.println("Animal constructor");
    }

    static void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    String name = "Dog";

    Dog() {
        super(); // Invoking parent class constructor
        System.out.println("Dog constructor");
    }

    void display() {
        System.out.println(super.name); // Accessing parent class instance variable
        super.eat(); // Invoking parent class method
    }
}


