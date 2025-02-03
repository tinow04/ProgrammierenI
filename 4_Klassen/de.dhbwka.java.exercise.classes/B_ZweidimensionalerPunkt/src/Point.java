public class Point {

    private double xKoordinate;
    private double yKoordinate;

    Point(double xKoordinate, double yKoordinate) {
        this.xKoordinate = xKoordinate;
        this.yKoordinate = yKoordinate;
    }

    private void setxKoordinate(double xKoordinate) {
        this.xKoordinate = xKoordinate;
    }
    public double getxKoordinate() {
        return xKoordinate;
    }

    private void setyKoordinate(double yKoordinate) {
        this.yKoordinate = yKoordinate;
    }
    public double getyKoordinate() {
        return yKoordinate;
    }

    public double distanceOrigin() {
        return Math.sqrt(xKoordinate * xKoordinate + yKoordinate * yKoordinate);
    }

    public double getDistance(Point other) {
        return Math.sqrt(Math.pow(this.xKoordinate - other.xKoordinate, 2) + Math.pow(this.yKoordinate - other.yKoordinate, 2));
    }

    public void mirrorOrigin() {
        xKoordinate = -xKoordinate;
        yKoordinate = -yKoordinate;
    }

    public String toString() {
        return "x: " + xKoordinate + ", y: " + yKoordinate;
    }

}
