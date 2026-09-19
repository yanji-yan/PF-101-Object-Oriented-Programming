// Inherits from L9Private
public class L9Protected extends L9Private {
    // PROTECTED: Accessible in the same package and by child classes
    protected String userRole = "Administrator";

    protected void displayRole() {
        System.out.println("User Role: " + userRole);
    }

    public static void main(String[] args) {
        L9Protected obj = new L9Protected();

        // 1. PROTECTED: Directly accessible inside subclass / same package
        obj.displayRole();

        // 2. PRIVATE: Cannot access directly (obj.secretKey causes an Error)
        // Must access via public getter/setter methods inherited from L9Private
        System.out.println("Secret Key via Getter: " + obj.getSecretKey());

        // Updating private data safely using setter
        obj.setSecretKey("NewSecret456");
        System.out.println("Updated Key via Getter: " + obj.getSecretKey());
    }
}