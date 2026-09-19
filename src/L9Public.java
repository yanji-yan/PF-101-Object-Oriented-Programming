// 'public' means this class is visible to any other class
public class L9Public {
    // Public field: accessible from an instance of L9Public
    public String message = "Hello from an instance of L9Public!";

    // Public method: requires an instance to be called
    public void displayMessage() {
        System.out.println(message);
    }
}