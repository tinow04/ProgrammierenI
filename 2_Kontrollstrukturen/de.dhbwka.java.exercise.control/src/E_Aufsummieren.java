import java.util.Scanner;

public class E_Aufsummieren {

    static int sum;

    static boolean positive = true;

    public static void main(String[] args) {
        addUp();
    }

    public static void addUp() {
        while(positive) {
            System.out.print("Zahl eingeben (<0 für Abbruch):");
            Scanner cScan = new Scanner(System.in);
            int scanInt = cScan.nextInt();
            if (scanInt < 0) {
                positive = false;
                System.out.println(sum);
            }
            sum = sum + scanInt;
        }
    }
}

