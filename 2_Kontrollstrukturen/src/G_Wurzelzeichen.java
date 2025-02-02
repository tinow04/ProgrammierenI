import java.util.Scanner;

public class G_Wurzelzeichen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wurzel aus welcher Zahl ziehen? ");
        double a = scanner.nextDouble();
        calculateSquareRoot(a);
    }

    public static void calculateSquareRoot(double a) {
        double x0 = a / 2; // Initial guess
        double x1 = (x0 + a / x0) / 2;

        System.out.printf("xn: %.15f%n", x0);
        
        int iteration = 1;
        while (Math.abs(x1 - x0) >= 1e-6) {
            x0 = x1;
            x1 = (x0 + a / x0) / 2;
            System.out.printf("xn: %.15f%n", x1);
            iteration++;
        }

        System.out.printf("Die Wurzel aus %.1f ist %.6f%n", a, x1);
    }
}