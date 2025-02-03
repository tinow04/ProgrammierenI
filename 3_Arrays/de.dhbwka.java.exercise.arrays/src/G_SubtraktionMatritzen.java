import java.util.Random;
import java.util.Scanner;

public class G_SubtraktionMatritzen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Bitte Anzahl der Zeilen n eingeben: ");
        int n = scanner.nextInt();
        System.out.print("Bitte Anzahl der Spalten m eingeben: ");
        int m = scanner.nextInt();

        int[][] matrixX = new int[n][m];
        int[][] matrixY = new int[n][m];

        // Fill matrices with random numbers
        fillMatrixWithRandomNumbers(matrixX, random);
        fillMatrixWithRandomNumbers(matrixY, random);

        // Print matrices
        System.out.println("X:");
        printMatrix(matrixX);
        System.out.println("Y:");
        printMatrix(matrixY);

        // Subtract matrices
        int[][] resultMatrix = subtractMatrices(matrixX, matrixY);

        // Print result
        System.out.println("X-Y:");
        printMatrix(resultMatrix);
    }

    public static void fillMatrixWithRandomNumbers(int[][] matrix, Random random) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(100); // Random numbers between 0 and 99
            }
        }
    }

    public static int[][] subtractMatrices(int[][] matrixX, int[][] matrixY) {
        int[][] resultMatrix = new int[matrixX.length][matrixX[0].length];
        for (int i = 0; i < matrixX.length; i++) {
            for (int j = 0; j < matrixX[i].length; j++) {
                resultMatrix[i][j] = matrixX[i][j] - matrixY[i][j];
            }
        }
        return resultMatrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
