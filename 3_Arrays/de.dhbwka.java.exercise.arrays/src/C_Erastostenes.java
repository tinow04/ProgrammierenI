import java.util.Arrays;

public class C_Erastostenes {
    static int[] array = new int[20];

    public static void main(String[] args) {
        int length = createArray();
        System.out.println("Array length: " + length);
    }

    public static int createArray() {
        for (int i = 1; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));
        return array.length;
    }
}