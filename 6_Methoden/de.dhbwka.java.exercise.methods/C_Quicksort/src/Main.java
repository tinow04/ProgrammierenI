public class Main {
    public static void main(String[] args) {
        int[] array = {9, 2, 7, 0, 5, 3, 1, 6, 3, 8, 4, 2};
        System.out.println("Unsortierte Zahlenfolge: ");
        for (int a : array) {
            System.out.print(a + " ");
        }
        System.out.println(" ");
        System.out.println("Sortierte Zahlenfolge");
        sort(array);
        for (int a : array) {
            System.out.print(a + " ");
        }
    }

    public static void sort(int[] array) {
        quicksort(array, 0, array.length - 1);
    }

    private static int[] quicksort(int[] data, int l, int r) {
        if (l < r) {
            int teiler = teile(data, l, r);
            quicksort(data, l, teiler - 1);
            quicksort(data, teiler + 1, r);
        }
        return data;
    }

    static int teile(int[] data, int links, int rechts) {
        int i = links;
        int j = rechts;
        int pivot = data[j];
        do {
            while (data[i] <= pivot && i < rechts) {
                i = i + 1;
            }
            while (data[j] >= pivot && j > links) {
                j = j - 1;
            }
            if (i < j) {
                int tmp = data[i];
                data[i] = data[j];
                data[j] = tmp;
            }
        } while (i < j);
        if (data[i] > pivot) {
            int tmp = data[rechts];
            data[rechts] = data[i];
            data[i] = tmp;
        }
        return i;
    }
}