import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UserDataHandler {
    private static final String FILENAME = "userdata.csv";

    public static void main(String[] args) {
        // Store user data
        storeUserData();

        // Retrieve user data
        retrieveUserData();
    }

    public static void storeUserData() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILENAME))) {
            // Writing header
            writer.write("Name,Age,Email\n");

            // Writing data for 10 users
            for (int i = 1; i <= 10; i++) {
                String userData = "User" + i + "," + (20 + i) + ",user" + i + "@example.com";
                writer.write(userData + "\n");
            }
            System.out.println("User data stored successfully.");
        } catch (IOException e) {
            System.err.println("Error storing user data: " + e.getMessage());
        }
    }

    public static void retrieveUserData() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILENAME))) {
            // Skipping header
            reader.readLine();

            // Reading data for 10 users
            String line;
            while ((line = reader.readLine()) != null) {
                String[] userData = line.split(",");
                System.out.println("Name: " + userData[0] + ", Age: " + userData[1] + ", Email: " + userData[2]);
            }
        } catch (IOException e) {
            System.err.println("Error retrieving user data: " + e.getMessage());
        }
    }
}
