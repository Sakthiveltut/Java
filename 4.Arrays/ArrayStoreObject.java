public class Main {
    public static void main(String[] args) {
        MyClass[] arr = new MyClass[3];
        
        // Create objects and store them in the array
        arr[0] = new MyClass(10);
        arr[1] = new MyClass(20);
        arr[2] = new MyClass(30);
        
        
        arr[0].display(); // Output: Value: 10
        
        // Call method on the object stored at index 1
        arr[1].display(); // Output: Value: 20
        
        // Call method on the object stored at index 2
        arr[2].display(); // Output: Value: 30
    }
}


class MyClass {
    private int value;

    public MyClass(int value) {
        this.value = value;
    }

    public void display() {
        System.out.println("Value: " + value);
    }
}

