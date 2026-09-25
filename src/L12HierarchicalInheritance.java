class Animal2{
    void eat () {
        System.out.println("eating...");

    }
}

class Dog2 extends Animal2{
    void bark(){
        System.out.println("barking...");
    }
}

class Cat extends Animal2{
    void meow(){
        System.out.println("meowing...");
    }
}

class L12HierarchicalInheritance {
    public static void main(String args[] ) {
        Cat c = new Cat();
        c.meow();
        c.eat();
    }
}