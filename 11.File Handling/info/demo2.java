import java.io.*;
import java.util.*;

public class UserData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define file name
        String fileName = "userdata.txt";

        try {
            // Write data to file
            /*ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName));

            for (int i = 0; i < 2; i++) {
                System.out.println("Enter user data:");

                System.out.print("Name: ");
                String name = scanner.nextLine();

                User user = new User(name);

                // Write User object to file
                objectOutputStream.writeObject(user);
            }

            objectOutputStream.close();*/

            // Read data from file
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName));
		
            System.out.println("\nUser data from file:");
            for (int i = 0; i < 2; i++) {
                // Read User object from file
                User user = (User) objectInputStream.readObject();

                // Display User data
                //System.out.println("Name: " + user.name);
                //System.out.println();
            }

            objectInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}


class User implements Serializable {
    String name, dob, address, userType, username, password;
    long mobile, accNo;
    double balance;

    public User(String name) {
        this.name = name;
    }
}

