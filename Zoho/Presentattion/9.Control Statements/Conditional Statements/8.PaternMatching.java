public class Main {
    public static void main(String[] args) {
        Object obj1 = 42;
	Object obj2 = "mosesh";
	Object obj3 = 'a';
	Object obj4 = null;
	Object obj5 = true;

	Integer in = 12;
	int age = 21;
	
        String result = switch (obj5) {
            case String s -> "String: " + s;
            case Integer i -> "Integer "+i;
            case Double d -> "Double: " + d;
	    case null -> "Object is null";
	    case Boolean bool-> "Boolean"+bool;
            default -> "Unknown object";
        };
        System.out.println(result);
    }
}
