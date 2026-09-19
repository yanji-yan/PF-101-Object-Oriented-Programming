public class L9Private {
    // PRIVATE: Accessible ONLY inside this class
    private String secretKey = "SuperSecret123";

    // Public getter method allowing controlled access from outside
    public String getSecretKey() {
        return secretKey;
    }

    // Public setter method allowing controlled updates from outside
    public void setSecretKey(String newKey) {
        this.secretKey = newKey;
    }
}