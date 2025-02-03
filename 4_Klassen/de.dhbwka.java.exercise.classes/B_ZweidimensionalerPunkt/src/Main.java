public class Main {
    public static void main(String[] args) {

        System.out.println("------------------");

        Point pointA = new Point(4.0, 2.0);
        System.out.println("A: " + pointA);
        System.out.println("Distand zum Ursprung: " + pointA.distanceOrigin());
        pointA.mirrorOrigin();
        System.out.println(String.format("Mirror point: %s", pointA));


        System.out.println("------------------");

        Point pointB = new Point(-1.0, -1.0);
        System.out.println("B: " + pointB);
        System.out.println("Distand zum Ursprung: " + pointB.distanceOrigin());
        pointB.mirrorOrigin();
        System.out.println(String.format("Mirror point: %s", pointB));


        System.out.println("------------------");
        System.out.println("Distance between Points: " + pointA.getDistance(pointB));

    }


}