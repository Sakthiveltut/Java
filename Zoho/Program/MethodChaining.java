public class Person {
    private String firstName;
    private String lastName;
    private int age;

    // Setter methods that return the object itself
    public Person setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public Person setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Person setAge(int age) {
        this.age = age;
        return this;
    }

    // Method to display person details
    public void displayDetails() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        // Using method chaining to create and initialize a Person object
        Person person = new Person()
            .setFirstName("John")
            .setLastName("Doe")
            .setAge(30);

        // Displaying person details
        person.displayDetails();
    }
}
