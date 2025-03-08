import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        typeNum();
    }
    
    public static void highestNum() {
        int i = 0;
        while(true) {
            i++;
            double x = 1;
            int n = i;
            System.out.println("i: " + i + "; " + x + "^"+ n + " = " + xPowerN(x, n));
        }
    }
    
    public static void typeNum() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie bitte die Basis ein!");
        double x = scan.nextDouble();
        System.out.println("Geben Sie bitte den positiven ganzzahligen Exponenten ein!");
        int n = scan.nextInt();
        System.out.println(x + "^"+ n + " = " + xPowerN(x, n));
    }

    public static double xPowerN(double x,int n) {
        if (n==0) {
            return 1.0;
        }

        return x * xPowerN(x, n - 1);
    }
}