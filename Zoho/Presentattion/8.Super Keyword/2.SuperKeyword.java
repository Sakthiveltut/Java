public class SuperKeyword {
    public static void main(String[] args) {

	Puppy p = new Puppy();
	p.run();
    }
}

class Animal {
    String name = "Animal";

    Animal() {
        System.out.println("Animal constructor");
    }
    Animal(String a) {
        System.out.println(a);
    }
     void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    //String name = "Dog";

    Dog() {
        super("Dog");  
        System.out.println("Dog constructor");
    }

    void walk() {
        System.out.println(super.name);
        //super.eat(); 
    }
}
class Puppy extends Dog{
	Puppy(){
		super();
	}
	void run(){
		System.out.println(super.name);
		super.eat();
	}
}


