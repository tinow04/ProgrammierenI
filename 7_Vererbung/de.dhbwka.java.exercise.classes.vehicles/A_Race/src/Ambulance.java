public class Ambulance extends Vehicle {
    private boolean isKrankenwagen;

    public Ambulance(double maxSpeedKph, boolean isKrankenwagen) {
        super(maxSpeedKph);
        this.wheels = 4;
        this.isKrankenwagen = isKrankenwagen;
    }

    public String toString() {
        return "Ambulance: " + super.toString() + (this.isKrankenwagen ? " with special permission" : "");
    }
}
