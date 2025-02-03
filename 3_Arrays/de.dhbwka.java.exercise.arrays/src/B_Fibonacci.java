import java.util.Arrays;

public class B_Fibonacci {

    public static void main(String[] args) {
        int[] fibonacciArray = new int[49];
        fibonacciArray[0] = 0;
        fibonacciArray[1] = 1;

        calcFibonacci(fibonacciArray);
        System.out.println(Arrays.toString(fibonacciArray));
    }

    public static void calcFibonacci(int[] fibonacciArray) {
        for(int i = 2; i < fibonacciArray.length; i++) {
            fibonacciArray[i] = fibonacciArray[i-1] + fibonacciArray[i-2];
        }
    }
}
