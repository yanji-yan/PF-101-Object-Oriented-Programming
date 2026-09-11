public class L5DefaultConstructor {

    // Default constructor (no parameters)
    L5DefaultConstructor() {
        System.out.println("Bike is created");
    }

    public static void main(String[] args) {
        // Creating an instance invokes the default constructor
        L5DefaultConstructor b = new L5DefaultConstructor();
    }
}