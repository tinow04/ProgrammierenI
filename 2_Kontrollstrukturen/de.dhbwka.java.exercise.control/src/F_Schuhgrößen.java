public class F_Schuhgrößen {

    public static void main(String[] args) {
        printShoeSizeTable();
    }

    public static void printShoeSizeTable() {
        System.out.println("Zentimeter   | Größe");
        System.out.println("--------------+------");

        double startCm = 19.33;
        double endCm = 20.00;
        int size = 30;

        for (int i = 0; i < 20; i++) {
            System.out.printf("%.2f - %.2f | %d%n", startCm, endCm, size);
            startCm += 0.67;
            endCm += 0.67;
            size++;
        }
    }
}

