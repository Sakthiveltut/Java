public class Main {
    public static void main(String[] args) {
        Object obj1 = 42;
	Object obj2 = "mosesh";
	Object obj3 = 'a';
	Object obj4 = null;

	Integer in = 12;

        String result = switch (obj4) {
            case String s -> "String: " + s;
            case Integer i -> "Integer "+i;
            case Double d -> "Double: " + d;
		case null -> "Object is null";
            default -> "Unknown object";
        };

        System.out.println(result);
    }
}
