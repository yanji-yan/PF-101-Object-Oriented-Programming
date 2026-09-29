class L13PolyMain {

    public static void main(String[] args) {
        L13PolyAnimal myAnimal = new L13PolyAnimal();
        L13PolyAnimal myPig = new Pig1();
        L13PolyAnimal myDog = new Dog3();
        L13PolyAnimal myBird = new Bird();
        L13PolyAnimal myCat = new Cat1();
// way to instantiate
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
        myBird.animalSound();
        myCat.animalSound();
    }
}