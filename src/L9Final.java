public class L9Final {
    int x = 10;
    final double PI = 3.14; // Added final keyword so PI acts as a constant

    public static void main(String[] args) {
        L9Final myObj = new L9Final();
        myObj.x = 50; // Allowed: x is non-final

        System.out.println(myObj.x);   // Outputs 50
        System.out.println(myObj.PI);  // Outputs 3.14
    }
}
