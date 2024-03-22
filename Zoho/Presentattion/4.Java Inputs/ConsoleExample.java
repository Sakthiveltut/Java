import java.io.Console;

public class ConsoleExample {
    public static void main(String[] args) {
        Console console = System.console();
	//Console console = new Console();

        if (console != null) {
            String line = console.readLine("Enter a line: ");
            console.writer().println("You entered: " + line);

            int intValue = Integer.parseInt(console.readLine("Enter an integer: "));
            console.writer().println("You entered an integer: " + intValue);

            float floatValue = Float.parseFloat(console.readLine("Enter a float: "));
            console.writer().println("You entered a float: " + floatValue);

            boolean boolValue = Boolean.parseBoolean(console.readLine("Enter a boolean (true/false): "));
            console.writer().println("You entered a boolean: " + boolValue);

            char[] password = console.readPassword("Enter a password: ");
            console.writer().println("You entered a password: "+ password);

        } else {
            System.out.println("Console is not available.");
        }
    }
}
