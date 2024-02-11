interface Animal {
    void Sound();
    void sleep();
}
class Dog implements Animal
{
    @Override
    public void Sound() {
        System.out.println("The Dog Sounds like : woof");
    }
 
    @Override
    public void sleep() {
        System.out.println("Dog Sleeping");
    }
}
public class interfaceDemo{
    public static void main(String args[]) {
        Dog o =new Dog();
        o.Sound();
        o.sleep();
    }
}