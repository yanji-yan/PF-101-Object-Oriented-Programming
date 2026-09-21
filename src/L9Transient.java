import java.io.Serializable;

public class L9Transient implements Serializable {
    public String username = "Juan";

    // 'transient' means this will NOT be saved to a file
    public transient String password = "Pass123";

    public void display() {
        System.out.println("User: " + username + " | Pass: " + password);
    }
}