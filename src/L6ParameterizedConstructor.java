public class L6ParameterizedConstructor {
    int id;
    String name;

    // Parameterized constructor
    L6ParameterizedConstructor(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        L6ParameterizedConstructor s1 = new L6ParameterizedConstructor(111, "Karan");
        L6ParameterizedConstructor s2 = new L6ParameterizedConstructor(222, "Aryan");

        s1.display();
        s2.display();
    }
}