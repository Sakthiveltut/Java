import java.util.ArrayList;
import java.util.List;

class User {
    private String username;
    private String email;

    public User(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

class UserDatabase {
    private List<User> userList;

    public UserDatabase() {
        userList = new ArrayList<>();
    }

    public void addUser(User user) {
        userList.add(user);
    }

    public List<User> getUserList() {
        return userList;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a UserDatabase object
        UserDatabase userDatabase = new UserDatabase();

        // Add some User objects to the user database
        userDatabase.addUser(new User("john123", "john@example.com"));
        userDatabase.addUser(new User("alice456", "alice@example.com"));
        userDatabase.addUser(new User("bob789", "bob@example.com"));

        // Get the list of User objects from the user database
        List<User> userList = userDatabase.getUserList();

        // Print all User objects in the list
        System.out.println("User List:");
        for (User user : userList) {
            System.out.println(user);
        }
    }
}


















import java.util.*;

class User {
    private String username;
    private String password;
    private String email;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}

class Message {
    private String sender;
    private String recipient;
    private String subject;
    private String body;
    private Date timestamp;

    public Message(String sender, String recipient, String subject, String body) {
        this.sender = sender;
        this.recipient = recipient;
        this.subject = subject;
        this.body = body;
        this.timestamp = new Date();
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        return body;
    }

    public Date getTimestamp() {
        return timestamp;
    }
}

class EmailService {
    private List<User> users;
    private List<Message> sentMessages;
    private List<Message> receivedMessages;
    private List<Message> draftMessages;

    public EmailService() {
        users = new ArrayList<>();
        sentMessages = new ArrayList<>();
        receivedMessages = new ArrayList<>();
        draftMessages = new ArrayList<>();
    }

    public void createUser(String username, String password, String email) {
        User user = new User(username, password, email);
        users.add(user);
    }

    public boolean login(String username, String password) {
        for (User user : users) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

    public void sendMessage(Message message) {
        sentMessages.add(message);
    }

    public void saveDraft(Message draft) {
        draftMessages.add(draft);
    }

    public List<Message> getSentMessages(String username) {
        List<Message> userSentMessages = new ArrayList<>();
        for (Message message : sentMessages) {
            if (message.getSender().equals(username)) {
                userSentMessages.add(message);
            }
        }
        return userSentMessages;
    }

    public List<Message> getReceivedMessages(String username) {
        List<Message> userReceivedMessages = new ArrayList<>();
        for (Message message : sentMessages) {
            if (message.getRecipient().equals(username)) {
                userReceivedMessages.add(message);
            }
        }
        return userReceivedMessages;
    }

    public List<Message> getDraftMessages(String username) {
        List<Message> userDraftMessages = new ArrayList<>();
        for (Message draft : draftMessages) {
            if (draft.getSender().equals(username)) {
                userDraftMessages.add(draft);
            }
        }
        return userDraftMessages;
    }

    public void logout(String username) {
        // Perform logout actions
    }
}

public class Main {
    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        // You can implement the user interface here
        // For example, handle user inputs and call methods of EmailService
    }
}
