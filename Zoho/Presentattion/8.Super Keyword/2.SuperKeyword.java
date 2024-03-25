public class SuperKeyword {
    public static void main(String[] args) {

	Puppy p = new Puppy();
	Puppy p1 = new Puppy("jackie");
	p.run();
    }
}

class Animal {
    static String name = "Animal";

    Animal() {
        System.out.println("Animal constructor");
    }
    Animal(String a) {
        System.out.println(a);
    }
     void eat() {
        System.out.println("Animal eating");
    }
}

class Dog extends Animal {
    //String name = "Dog";

    Dog(){
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
		//super();
	}
	Puppy(String name){
		//super();
		System.out.println(name);
	}
	void run(){
		System.out.println(super.name);
		super.eat();
	}
}


