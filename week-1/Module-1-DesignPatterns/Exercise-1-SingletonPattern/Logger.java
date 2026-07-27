package Week1;

public class Logger {
    private static Logger instance;

    // Step 2: Make constructor private
    private Logger() {
        System.out.println("Logger Instance Created");
    }

    // Step 3: Provide public method to access instance
    public static Logger getInstance() {

        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }

    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}
