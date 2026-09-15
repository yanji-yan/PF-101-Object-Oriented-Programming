public class L7ConsOverloading {
    int id;
    String name;
    int age;

    // Constructor with two parameters
    L7ConsOverloading(int i, String n) {
        id = i;
        name = n;
    }

    // Overloaded constructor with three parameters
    L7ConsOverloading(int i, String n, int a) {
        id = i;
        name = n;
        age = a;
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        L7ConsOverloading s1 = new L7ConsOverloading(111, "Karan");
        L7ConsOverloading s2 = new L7ConsOverloading(222, "Aryan", 25);

        s1.display();
        s2.display();
    }
}