import java.util.*;


public class EmailApplication {
    private Map<String, User> users;
    private User currentUser;
    private Scanner scanner;

    public EmailApplication() {
        users = new HashMap<>();
        scanner = new Scanner(System.in);
    }

    public void createAccount() {
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        users.put(username, new User(username, password));
        System.out.println("Account created successfully!");
    }

    public void login() {
        System.out.println("Enter username:");
        String username = scanner.nextLine();
        System.out.println("Enter password:");
        String password = scanner.nextLine();
        User user = users.get(username);
        if (user != null && user.getPassword().equals(password)) {
            currentUser = user;
            System.out.println("Login successful! Welcome, " + username + "!");
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
    }

    public void sendMessage() {
        if (currentUser == null) {
            System.out.println("Please log in first.");
            return;
        }
        System.out.println("Enter recipient:");
        String recipient = scanner.nextLine();
        System.out.println("Enter CC recipients (comma-separated, leave empty if none):");
        String ccRecipients = scanner.nextLine();
        System.out.println("Enter message:");
        String message = scanner.nextLine();
        String timeStamp = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date());
        StringBuilder fullMessage = new StringBuilder();
        fullMessage.append("Time: ").append(timeStamp).append("\n");
        fullMessage.append("To: ").append(recipient).append("\n");
        if (!ccRecipients.isEmpty()) {
            fullMessage.append("CC: ").append(ccRecipients).append("\n");
        }
        fullMessage.append("Message: ").append(message);
        currentUser.addSentMessage(fullMessage.toString());
        System.out.println("Message sent successfully!");
    }

    public void draftMessage() {
        if (currentUser == null) {
            System.out.println("Please log in first.");
            return;
        }
        System.out.println("Enter message to draft:");
        String message = scanner.nextLine();
        currentUser.addDraftMessage(message);
        System.out.println("Message drafted successfully!");
    }

    public void viewSentMessages() {
        if (currentUser == null) {
            System.out.println("Please log in first.");
            return;
        }
        List<String> sentMessages = currentUser.getSentMessages();
        if (sentMessages.isEmpty()) {
            System.out.println("No sent messages to display.");
        } else {
            System.out.println("Sent Messages:");
            for (String message : sentMessages) {
                System.out.println(message);
            }
        }
    }

    public void viewReceivedMessages() {
        if (currentUser == null) {
            System.out.println("Please log in first.");
            return;
        }
        List<String> receivedMessages = currentUser.getReceivedMessages();
        if (receivedMessages.isEmpty()) {
            System.out.println("No received messages to display.");
        } else {
            System.out.println("Received Messages:");
            for (String message : receivedMessages) {
                System.out.println(message);
            }
        }
    }

    public void viewDraftMessages() {
        if (currentUser == null) {
            System.out.println("Please log in first.");
            return;
        }
        List<String> draftMessages = currentUser.getDraftMessages();
        if (draftMessages.isEmpty()) {
            System.out.println("No draft messages to display.");
        } else {
            System.out.println("Draft Messages:");
            for (String message : draftMessages) {
                System.out.println(message);
            }
        }
    }

    public void logout() {
        currentUser = null;
        System.out.println("Logged out successfully!");
    }

    public void run() {
        boolean exit = false;
        while (!exit) {
            System.out.println("\nEmail Application Menu:");
            System.out.println("1. Create Account");
            System.out.println("2. Login");
            System.out.println("3. Send Message");
            System.out.println("4. Draft Message");
            System.out.println("5. View Sent Messages");
            System.out.println("6. View Received Messages");
            System.out.println("7. View Draft Messages");
            System.out.println("8. Logout");
            System.out.println("9. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline
            switch (choice) {
                case 1:
                    createAccount();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    sendMessage();
                    break;
                case 4:
                    draftMessage();
                    break;
                case 5:
                    viewSentMessages();
                    break;
                case 6:
                    viewReceivedMessages();
                    break;
                case 7:
                    viewDraftMessages();
                    break;
                case 8:
                    logout();
                    break;
                case 9:
                    exit = true;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }

    public static void main(String[] args) {
        EmailApplication emailApp = new EmailApplication();
        emailApp.run();
    }
}

class User {
    private String username;
    private String password;
    private List<String> sentMessages;
    private List<String> receivedMessages;
    private List<String> draftMessages;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.sentMessages = new ArrayList<>();
        this.receivedMessages = new ArrayList<>();
        this.draftMessages = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void addSentMessage(String message) {
        sentMessages.add(message);
    }

    public void addReceivedMessage(String message) {
        receivedMessages.add(message);
    }

    public void addDraftMessage(String message) {
        draftMessages.add(message);
    }

    public List<String> getSentMessages() {
        return sentMessages;
    }

    public List<String> getReceivedMessages() {
        return receivedMessages;
    }

    public List<String> getDraftMessages() {
        return draftMessages;
    }
}

