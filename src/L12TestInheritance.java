class Vehicle {
   void start(){
       System.out.println("Vehicle is starting...");
   }
}

class Car extends Vehicle{
    void driving (){
        System.out.println("Car is driving...");
    }
}

class Motorcycle extends Vehicle{
    void riding (){
        System.out.println("Motorcycle is riding...");
    }
}

class L12TestInheritance {
    public static void main(String[] args) {

        Vehicle v = new Vehicle();
        Car c = new Car();
        Motorcycle m = new Motorcycle();

      c.driving();
      v.start();
      m.riding();
      v.start();
    }
}
