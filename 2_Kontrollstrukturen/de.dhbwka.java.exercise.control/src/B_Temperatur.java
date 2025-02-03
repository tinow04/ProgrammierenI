public class B_Temperatur {


    public static void main(String[] args) {
        printHeader();
        calcTemp();
    }

    public static void printHeader() {
        System.out.println("Fahrenheit   |   Celsius");

        for (int i = 0; i < 13; i++) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 0; i < 10; i++) {
            System.out.print("-");
        }
        System.out.println(" ");
    }

    public static void calcTemp() {
        for(float i = 0; i <= 300; i++) {
            float celsius = ((float) 5 /9) * (i-32);
            System.out.printf("%-13.1f| %7.2f%n", i, celsius);
        }

    }

}
