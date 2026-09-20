public class L9Static {
    // 'static' field: exists once for the class, shared everywhere
    public static String appName = "Yanji App";

    // 'static' method: called directly on L9Static without creating an object
    public static void printAppName() {
        System.out.println("App Name: " + appName);
    }

    // Main method to demonstrate accessing both files
    public static void main(String[] args) {
        // 1. STATIC: Call directly using the class name (no 'new' keyword)
        L9Static.printAppName();

        // 2. PUBLIC (Non-Static): Must create an object using 'new' to access it
        L9Public obj = new L9Public();
        obj.displayMessage();
    }
}
