class Animal {

void eat() {
    System.out.println("eating.."); }

    public void animalSound() {
    }
}

class Dog extends Animal {
void bark () {
    System.out.println("barking.."); }
}

    class L12Inheritance {
        public static void main(String[] args) {
            Dog d = new Dog();
            d.bark();
            d.eat();}}
