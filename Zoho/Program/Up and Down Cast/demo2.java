class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class demo2 {
    public static void main(String[] args) {
        // Normal object creation
        Dog normalDog = new Dog();
        normalDog.makeSound();  // Accessing method from Dog class
        normalDog.bark();       // Accessing method from Dog class

        // Upcasting
        Animal upcastedAnimal = new Dog();
        upcastedAnimal.makeSound();  // Accessing method from Animal class
        // upcastedAnimal.bark();    // Compilation error, bark() is not in Animal class
    }
}
