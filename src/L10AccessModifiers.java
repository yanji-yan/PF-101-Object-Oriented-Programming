public class L10AccessModifiers {
    // 1. PUBLIC: Accessible from any class anywhere
    public String publicField = "Public: Accessible everywhere";

    // 2. PROTECTED: Accessible in the same package or by subclasses
    protected String protectedField = "Protected: Same package & subclasses";

    // 3. DEFAULT (no modifier): Accessible only within the same package
    String defaultField = "Default: Package-private only";

    // 4. PRIVATE: Accessible ONLY inside this class
    private String privateField = "Private: Hidden from other classes";

    // Public method providing controlled access to the private field
    public void displayPrivate() {
        System.out.println(privateField); // OK: Inside L10AccessModifiers class
    }
}