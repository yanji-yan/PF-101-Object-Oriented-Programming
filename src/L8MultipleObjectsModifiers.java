public class L8MultipleObjectsModifiers {
    int x = 5;

    public static void main(String[] args) {
        L8MultipleObjectsModifiers myObj1 = new L8MultipleObjectsModifiers(); // Object 1
        L8MultipleObjectsModifiers myObj2 = new L8MultipleObjectsModifiers(); // Object 2
        myObj2.x = 25;
        System.out.println(myObj1.x); // Outputs 5
        System.out.println(myObj2.x); // Outputs 25

    }
}