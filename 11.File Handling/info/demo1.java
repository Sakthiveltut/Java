import java.io.*;
import java.util.*;

class User implements Serializable {
    private String name;
    private String username;
    private String password;
    private String address;
    private long mobile;

    public User(String name, String username, String password, String address, long mobile) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.address = address;
        this.mobile = mobile;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nUsername: " + username + "\nAddress: " + address + "\nMobile: " + mobile;
    }
}

class Account implements Serializable {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

class Bank implements Serializable {
    private Map<String, User> users;
    private Map<String, Account> accounts;
    private static final String USER_FILE = "users.dat";
    private static final String ACCOUNT_FILE = "accounts.dat";

    public Bank() {
        users = new HashMap<>();
        accounts = new HashMap<>();
        loadUsers();
        loadAccounts();
    }

    public void createUser(String name, String username, String password, String address, long mobile) {
        User user = new User(name, username, password, address, mobile);
        users.put(username, user);
        saveUsers();
    }

    public boolean login(String username, String password) {
        if (users.containsKey(username)) {
            User user = users.get(username);
            return user.getPassword().equals(password);
        }
        return false;
    }

    public void createAccount(String username, double initialBalance) {
        String accountNumber = generateAccountNumber();
        Account account = new Account(accountNumber, initialBalance);
        accounts.put(accountNumber, account);
        saveAccounts();
    }

    public void deposit(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            Account account = accounts.get(accountNumber);
            account.deposit(amount);
            saveAccounts();
        } else {
            System.out.println("Account not found");
        }
    }

    public void withdraw(String accountNumber, double amount) {
        if (accounts.containsKey(accountNumber)) {
            Account account = accounts.get(accountNumber);
            account.withdraw(amount);
            saveAccounts();
        } else {
            System.out.println("Account not found");
        }
    }

    public double checkBalance(String accountNumber) {
        if (accounts.containsKey(accountNumber)) {
            return accounts.get(accountNumber).getBalance();
        } else {
            System.out.println("Account not found");
            return -1;
        }
    }

    private void loadUsers() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(USER_FILE))) {
            users = (HashMap<String, User>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading users: " + e.getMessage());
        }
    }

    private void saveUsers() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(USER_FILE))) {
            oos.writeObject(users);
        } catch (IOException e) {
            System.out.println("Error saving users: " + e.getMessage());
        }
    }

    private void loadAccounts() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ACCOUNT_FILE))) {
            accounts = (HashMap<String, Account>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading accounts: " + e.getMessage());
        }
    }

    private void saveAccounts() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ACCOUNT_FILE))) {
            oos.writeObject(accounts);
        } catch (IOException e) {
            System.out.println("Error saving accounts: " + e.getMessage());
        }
    }

    private String generateAccountNumber() {
        // Generate a random account number (you can implement your own logic)
        Random random = new Random();
        return String.valueOf(random.nextInt(900000) + 100000);
    }
}

public class BankingSystem {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Bank bank = new Bank();

    public static void main(String[] args) {
        displayMenu();
    }

    private static void displayMenu() {
        while (true) {
            System.out.println("\nWelcome to the Banking System");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    register();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    System.out.println("Thank you for using the Banking System. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void register() {
        System.out.println("\n--- Registration ---");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your address: ");
        String address = scanner.nextLine();

        System.out.print("Enter your mobile number: ");
        long mobile = scanner.nextLong();
        scanner.nextLine(); // Consume newline

        System.out.print("Choose a username: ");
        String username = scanner.nextLine();

        System.out.print("Choose a password: ");
        String password = scanner.nextLine();

        bank.createUser(name, username, password, address, mobile);
        System.out.println("Registration successful. You can now login.");
    }

    private static void login() {
        System.out.println("\n--- Login ---");
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (bank.login(username, password)) {
            System.out.println("Login successful.");
            displayAccountMenu(username);
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
    }

    private static void displayAccountMenu(String username) {
        while (true) {
            System.out.println("\n--- Account Menu ---");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Logout");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    createAccount(username);
                    break;
                case 2:
                    deposit(username);
                    break;
                case 3:
                    withdraw(username);
                    break;
                case 4:
                    checkBalance(username);
                    break;
                case 5:
                    System.out.println("Logged out.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void createAccount(String username) {
        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        bank.createAccount(username, initialBalance);
        System.out.println("Account created successfully.");
    }

    private static void deposit(String username) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        bank.deposit(accountNumber, amount);
        System.out.println("Deposit successful.");
    }

    private static void withdraw(String username) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        bank.withdraw(accountNumber, amount);
        System.out.println("Withdrawal successful.");
    }

    private static void checkBalance(String username) {
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        double balance = bank.checkBalance(accountNumber);
        if (balance != -1) {
            System.out.println("Balance: " + balance);
        }
    }
}
