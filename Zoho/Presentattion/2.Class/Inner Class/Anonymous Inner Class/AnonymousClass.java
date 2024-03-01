class Parent {
    void display() {
        System.out.println("Parent class");
    }
}

public class AnonymousClass{
    public static void main(String[] args) {
        // Create an instance of the class using an anonymous class
        Parent myObject = new Parent() 
	{
            @Override
            void display() 
	    {
                System.out.println("Anonymous class extending Parent");
            }
        };

        // Call the overridden display method
        myObject.display();
    }
}
