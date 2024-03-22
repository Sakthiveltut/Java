public class NestedInterface implements OuterInterface, OuterInterface.InnerInterface {
    public static void main(String[] args) {
    
    NestedInterface ni = new NestedInterface();
    //ni.outerMethod();
    ni.innerMethod();
    //NestedInterface.outerMethod();
	System.out.println(VAR1);
	System.out.println(VAR2);
    }
}

interface OuterInterface {
	int VAR1 = 10;
    	static void outerMethod(){
        	System.out.println("OuterMethod");
    	}

   	interface InnerInterface {
	int VAR2 = 100;
        default void innerMethod(){
            System.out.println("InnerMethod");
        }
    }
}