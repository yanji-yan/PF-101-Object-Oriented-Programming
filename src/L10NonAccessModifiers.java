public class L10NonAccessModifiers {
    // 1. STATIC: Class-level member (shared by all, no object creation required)
    public static String appName = "Java Modifiers Demo";

    // 2. FINAL: Constant value (cannot be overridden or re-assigned)
    public static final double MAX_SCORE = 100.0;

    public static void main(String[] args) {
        // --- USING NON-ACCESS MODIFIERS ---
        // Access static and final members directly via the class name
        System.out.println("App Name (static): " + L10NonAccessModifiers.appName);
        System.out.println("Max Score (final): " + L10NonAccessModifiers.MAX_SCORE);
        // L10NonAccessModifiers.MAX_SCORE = 200.0; // ERROR: Cannot assign a value to a final variable

        System.out.println("--------------------------------------------------");

        // --- USING ACCESS MODIFIERS ---
        L10AccessModifiers accessObj = new L10AccessModifiers();

        System.out.println(accessObj.publicField);    // OK: Public
        System.out.println(accessObj.protectedField); // OK: Same package
        System.out.println(accessObj.defaultField);   // OK: Same package
        
        // System.out.println(accessObj.privateField); // ERROR: privateField has private access in L10AccessModifiers
        accessObj.displayPrivate();                   // OK: Public method accesses internal private data
    }
}