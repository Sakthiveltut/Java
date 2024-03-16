interface OuterInterface {
    static void outerMethod(){
        System.out.println("OuterMethod");
    }

    public interface InnerInterface {
        default void innerMethod(){
            System.out.println("InnerMethod");
        }
    }
}

public class NestedInterface implements OuterInterface.InnerInterface {
    public static void main(String[] args) {
    
    NestedInterface ni = new NestedInterface();
    //ni.outerMethod();
    ni.innerMethod();
    NestedInterface.outerMethod();
    }
}
