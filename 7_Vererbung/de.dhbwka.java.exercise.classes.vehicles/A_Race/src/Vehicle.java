import java.util.Scanner;

public class Vehicle {

    public Vehicle(double maxSpeedKph) {
        this.maxSpeedKph = maxSpeedKph;
    }

    int wheels = 0;
    private double maxSpeedKph = 0.0;
    private double currentSpeedKph = 0.0;
    private double position;

    double setSpeed() {
        Scanner speed = new Scanner(System.in);
        return this.currentSpeedKph = speed.nextDouble();
    }

    double drive(double minutes) {
        double kpm = maxSpeedKph / 60;

        this.position += kpm * minutes;
        return this.position;
    }

    public double getPosition() {
        return this.position;
    }

    public String toString() {
        return "Wheels: " + wheels + " | Max. Speed: " + maxSpeedKph + " | Current Speed: " + currentSpeedKph + " | Position (km): " + position;
    }

}
