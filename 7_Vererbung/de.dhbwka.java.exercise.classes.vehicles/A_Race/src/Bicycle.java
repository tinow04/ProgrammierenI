public class Bicycle extends Vehicle {
    public Bicycle(double maxSpeedKph) {
        super(maxSpeedKph);
        this.wheels = 2;
    }

    public String toString() {
        return "Bicycle: " + super.toString();
    }

}
