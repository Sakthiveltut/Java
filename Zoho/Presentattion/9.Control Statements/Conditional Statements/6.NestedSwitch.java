public class Main {
    public static void main(String[] args) {
        int grade = 1;
        int section = 1;

        switch (grade) {
            case 1:
                System.out.println("Grade 1");
                switch (section) {
                    case 1:
                        System.out.println("Section A");
                        break;
                    case 2:
                        System.out.println("Section B");
                        break;
                    default:
                        System.out.println("Invalid section");
                }
                break;
            case 2:
                System.out.println("Grade 2");
            default:
                System.out.println("Invalid grade");
        }
    }
}
