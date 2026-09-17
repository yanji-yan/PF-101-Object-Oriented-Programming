public class L7ConsOverloading2 {
    int year;
    String model;

    // Constructor 1: No parameters
    public L7ConsOverloading2() {
        year = 2026;
        model = "Unknown";
    }

    // Constructor 2: Two parameters
    public L7ConsOverloading2(int y, String m) {
        year = y;
        model = m;
    }

    public static void main(String[] args) {
        L7ConsOverloading2 car1 = new L7ConsOverloading2();             // Uses Constructor 1
        L7ConsOverloading2 car2 = new L7ConsOverloading2(1969, "Ford"); // Uses Constructor 2

        System.out.println(car1.model + " - " + car1.year);
        System.out.println(car2.model + " - " + car2.year);
    }
}
// Outputs:
// Unknown - 2026
// Ford - 1969