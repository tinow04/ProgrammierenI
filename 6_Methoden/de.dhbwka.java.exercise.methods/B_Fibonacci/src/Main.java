import java.util.Scanner;

public class Main {

    static double startFi = 0;
    static double startF1 = 1;

    public static void main(String[] args) {
        double n = readNumber();
        System.out.println("Fibonacci Zahlen::");
        calcFibo(startFi, startF1, n);
    }

    public static int readNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wie viele Fibonacci-Zahlen berechnen?");
        return scan.nextInt();
    }

    public static void calcFibo(double fi, double f1, double n) {
        if (n <= 0) {
            return;
        }
        System.out.print(fi + " ");
        calcFibo(f1, fi + f1, n - 1);
    }
}