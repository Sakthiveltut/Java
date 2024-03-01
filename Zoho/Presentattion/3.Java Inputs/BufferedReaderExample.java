import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Read a line of text
        System.out.print("Enter a line: ");
        String line = reader.readLine();
        System.out.println("You entered: " + line);

        // Read an integer
        System.out.print("Enter an integer: ");
        int intValue = Integer.parseInt(reader.readLine());
        System.out.println("You entered an integer: " + intValue);

        // Read a float
        System.out.print("Enter a float: ");
        float floatValue = Float.parseFloat(reader.readLine());
        System.out.println("You entered a float: " + floatValue);

        // Read a character
        System.out.print("Enter a character: ");
        char charValue = reader.readLine().charAt(0);
        System.out.println("You entered a character: " + charValue);

        // Read a boolean
        System.out.print("Enter a boolean (true/false): ");
        boolean boolValue = Boolean.parseBoolean(reader.readLine());
        System.out.println("You entered a boolean: " + boolValue);

    }
}
