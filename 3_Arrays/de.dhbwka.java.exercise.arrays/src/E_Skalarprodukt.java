import java.util.Scanner;

public class E_Skalarprodukt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte Anzahl der Elemente n eingeben: ");
        int n = scanner.nextInt();
        double[] vectorX = new double[n];
        double[] vectorY = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Bitte x_" + i + " eingeben: ");
            vectorX[i] = scanner.nextDouble();
        }

        for (int i = 0; i < n; i++) {
            System.out.print("Bitte y_" + i + " eingeben: ");
            vectorY[i] = scanner.nextDouble();
        }

        double dotProduct = calculateDotProduct(vectorX, vectorY);
        System.out.println("Das Skalarprodukt von x und y ist " + dotProduct);
    }

    public static double calculateDotProduct(double[] vectorX, double[] vectorY) {
        double sum = 0;
        for (int i = 0; i < vectorX.length; i++) {
            sum += vectorX[i] * vectorY[i];
        }
        return sum;
    }

}
