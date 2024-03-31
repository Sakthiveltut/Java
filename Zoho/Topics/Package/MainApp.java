//package mainPackage;
import myPackage.HelloWorld;
import myPackage1.Add;

public class MainApp {
    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();
        hello.sayHello();
	
	Add a = new Add();
	a.addition();
    }
}
