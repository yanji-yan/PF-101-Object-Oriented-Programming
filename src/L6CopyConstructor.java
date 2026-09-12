public class L6CopyConstructor {
    int id;
    String name;

    // Parameterized constructor
    L6CopyConstructor(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        L6CopyConstructor s1 = new L6CopyConstructor(111, "Karan");
        L6CopyConstructor s2 = new L6CopyConstructor(222, "Aryan");

        s1.display();
        s2.display();
    }
}