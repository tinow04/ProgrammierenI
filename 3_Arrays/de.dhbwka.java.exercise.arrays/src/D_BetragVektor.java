import java.util.Scanner;

public class D_BetragVektor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte Anzahl der Elemente n eingeben: ");
        int n = scanner.nextInt();
        double[] vector = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Bitte Zahl " + i + " eingeben: ");
            vector[i] = scanner.nextDouble();
        }

        double norm = calculateNorm(vector);
        System.out.println("Der Betrag von x ist " + norm);
    }

    public static double calculateNorm(double[] vector) {
        double sum = 0;
        for (double v : vector) {
            sum += v * v;
        }
        return Math.sqrt(sum);
    }

}
