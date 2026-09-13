public class ConsGetSet {
    // Variable declarations required by Java
    public String make;
    public String brand;
    public String color;
    public int speed;
    public boolean isRunning;

    // Constructor matching the class name
    public ConsGetSet(String make, String brand, String color, int speed, boolean isRunning) {
        this.make = make;
        this.brand = brand;
        this.color = color;
        this.speed = speed;
        this.isRunning = true;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean getIsRunning() {
        return isRunning;
    }

    public void setIsRunning(boolean isRunning) {
        this.isRunning = isRunning;
    } // Removed the stray period '.' here
}