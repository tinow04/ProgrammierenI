import java.util.ArrayList;
import java.util.Scanner;

public class Horner {

    private int max = 10;
    private int min = 1;
    private int range = max - min + 1;

    StringBuilder result = new StringBuilder();

    ArrayList<Double> degree = new ArrayList<Double>();

    public Horner() {

    }

    public void createPolynom() {
        createDegreeList();

        for (int i = 0; i < degree.toArray().length; i++) {
            result.append(degree.get(i));

            if (i < degree.size() - 1) {
                int j = i + 1;
                result.append("x^" + j + " + ");
            }
        }
        result.append("x^" + degree.toArray().length);
    }

    public void printPoly() {
        createDegreeList();
        System.out.println(result.toString());
    }

    private void createDegreeList() {
        System.out.print("Anzahl der Grade: ");
        Scanner degreeScan = new Scanner(System.in);
        double degreeCount = Double.parseDouble(degreeScan.nextLine());
        System.out.print("");

        for (int i = 0; i < degreeCount; i++) {
            int rand = (int)(Math.random() * range) + min;
            degree.add((double) rand);
        }
    }

}
