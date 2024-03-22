public class SuperKeyword {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.display();
    }
}

class Animal {
    String name = "Animal";
    private String gender = "Animal gender";

    Animal() {
        System.out.println("Animal constructor");
    }
    Animal(String a) {
        System.out.println(a);
    }
    static void eat() {
        System.out.println("Animal eats");
    }
	private void hunting(){
		System.out.println("Hunting");
	}
}

class Dog extends Animal {
    String name = "Dog";

    Dog() {
        super(); 
	//super("Dog"); //call to super must be first statement in constructor
	System.out.println(super.name);
        System.out.println("Dog constructor");
    }

    void display() {
	System.out.println("Name: "+name); 
        System.out.println(super.name); 
        super.eat();

	//System.out.println(super.gender);
	//super.hunting();
    }
}


