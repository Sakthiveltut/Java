public class OutputQuestion {
	    
	static class Parent {
        	static String message = "Hello from Parent";        
		String instanceMessage = "Instance message from Parent";

        	static void staticMethod() {
            		System.out.println("Static method in Parent");        
		}

        	void instanceMethod() {            
			System.out.println("Instance method in Parent");
        	}   
	}	 

    	static class Child extends Parent {        
		static String message = "Hello from Child";
        	String instanceMessage = "Instance message from Child";
        	static void staticMethod() {            
			System.out.println("Static method in Child");
        	}
        	@Override        
		void instanceMethod() {
            		System.out.println("Instance method in Child");        
		}
    	}
	
    public static void main(String[] args) {        
	Parent parent = new Child();
        System.out.println(parent.message);
        System.out.println(parent.instanceMessage);        
	parent.staticMethod();
        parent.instanceMethod();
        Child child = new Child();        
	System.out.println(child.message);
        System.out.println(child.instanceMessage);        
	child.staticMethod();
        child.instanceMethod();    
	}
}
