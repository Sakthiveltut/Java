public class interfaceModeDemo {
    public static void main(String[] args) {
        System.out.println("A : " + interDemo.A);
        interDemo.fun3();
    }
}
 
interface interDemo {
    final static int A = 25;
 
    public abstract void fun1();
 
    public abstract void fun2();
 
    public static void fun3() {
        System.out.println("I am Fun-3");
    }
    private void fun6(){
        System.out.println("Fun-6");
    }
    default void fun5() {
        System.out.println("Fun-5");
    }
}
 
interface interDemo2 extends interDemo {
    void fun4();
}
 
class TestInter implements interDemo2 {
 
    @Override
    public void fun1() {
        System.out.println("Fun-1");
    }
 
    @Override
    public void fun2() {
        System.out.println("Fun-2");
    }
 
    @Override
    public void fun4() {
        System.out.println("Fun-4");
    }
}



