import java.util.Scanner;

public class F_Bubblesort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte Anzahl der Elemente n eingeben: ");
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Zahl " + i + " eingeben: ");
            array[i] = scanner.nextInt();
        }

        bubbleSort(array);

        System.out.print("Sortiert: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 1; i < n; i++) {
                if (array[i - 1] > array[i]) {
                    int temp = array[i - 1];
                    array[i - 1] = array[i];
                    array[i] = temp;
                    swapped = true;
                }
            }
            n--;
        } while (swapped);
    }
}