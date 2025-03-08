public class RacingCar extends Vehicle {
    public RacingCar(double maxSpeedKph) {
        super(maxSpeedKph);
        this.wheels = 4;
    }

    public String toString() {
        return "Rennwagen: " + super.toString();
    }
}
