public class C_Wildbestand {

    static double countHirsche = 200;
    static int counter = 0;

    public static void main(String[] args) {
        calcHirsche();
    }

    public static void calcHirsche() {
        while(countHirsche <= 300) {
            countHirsche = countHirsche * 1.1;
            countHirsche = countHirsche - 15;
            counter++;

            System.out.println(counter + ": " + countHirsche);
        }
    }

}
