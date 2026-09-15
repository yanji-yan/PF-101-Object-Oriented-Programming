public class L2FinalAttributes {
    final int x = 10;

    public static void main(String[] args) {
        L2FinalAttributes myObj = new L2FinalAttributes();
        // myObj.x = 25; // will generate an error: cannot assign a value to a final variable
        System.out.println(myObj.x);
    }
}