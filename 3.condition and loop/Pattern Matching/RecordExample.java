record Person(String name, int age) {}

public class RecordPatternMatchingExample {
    public static void main(String[] args) {
        Person person = new Person("John", 30);

        String result = switch (person) {
            case Person p when p.age() < 18 -> "Young person";
            case Person p when p.age() >= 18 -> "Adult";
            default -> "Unknown person";
        };

        System.out.println(result);
    }
}
