import java.util.Random;
import java.util.stream.IntStream;

public class A_MittelwertUndStandardabweichung {

    public static void main(String[] args) {
        calcMittelwert();
    }

    public static int[] generateRandomArray(int size, int min, int max) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt((max - min) + 1) + min;
        }

        return array;
    }

    public static void calcMittelwert() {
        int sum = IntStream.of(generateRandomArray(10, 1, 100)).sum();
        System.out.printf("Die Summe ist %d%n", sum);
        double mittelwert = (double) sum / 10;
        System.out.printf("Der Mittelwert ist %f", mittelwert);
    }
}
