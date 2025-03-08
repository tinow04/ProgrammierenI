public class Car extends Vehicle {
    public Car(double maxSpeedKph) {
        super(maxSpeedKph);
        this.wheels = 4;
    }

    public String toString() {
        return "Car: " + super.toString();
    }
}
