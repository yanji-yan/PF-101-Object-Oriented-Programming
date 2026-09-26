class Animal1{
    public void eat(){
        System.out.println("eating...");
    }
}

class Dog1 extends Animal{
    void bark(){
        System.out.println("barking...");
    }
}

class BabyDog extends Dog{
    void weep(){
        System.out.println("weeping...");
    }
}

class L12MultilevelInheritance extends Animal {
    public static void main(String[] args) {
        BabyDog d = new BabyDog();
        d.weep();
        d.bark();
        d.eat();
    }
}