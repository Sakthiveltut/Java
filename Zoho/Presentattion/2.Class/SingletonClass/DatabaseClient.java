public class DatabaseClient {
    public static void main(String[] args) {
        DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getInstance();

        connectionManager.openConnection();
        connectionManager.closeConnection();
    }
}

// Singleton class for managing database connections
class DatabaseConnectionManager {
    private static DatabaseConnectionManager instance;

    private DatabaseConnectionManager() {}

    public static DatabaseConnectionManager getInstance() {
        if (instance == null) {
		synchronized (DatabaseConnectionManager.class) {
    if (instance == null) {
        instance = new DatabaseConnectionManager();
    }
}

                    instance = new DatabaseConnectionManager();
        }
        return instance;
    }

    public void openConnection() {
        System.out.println("Opening database connection...");
    }

    public void closeConnection() {
        System.out.println("Closing database connection...");
    }
}

