import java.util.Scanner;

public class H_Zahlenraten {

    static String userName;
    static int randNum;
    static int guessedNum;

    public static void main(String[] args) {
        nameInput();
        createRandNum();
        guessNum();
    }

    public static void nameInput() {

        System.out.print("Wie heißt du? ");
        Scanner name = new Scanner(System.in);  // Create a Scanner object
        userName = name.nextLine();  // Read user input
    }

    public static void guessNum() {
        while(guessedNum != randNum) {
            System.out.printf("%s, rate eine Zahl [1-100]:", userName);
            Scanner num = new Scanner(System.in);  // Create a Scanner object
            guessedNum = num.nextInt();  // Read user input

            if (guessedNum < randNum) {
                System.out.printf("%s ist zu niedrig%n", guessedNum);
                System.out.println("");
            } else if (guessedNum > randNum) {
                System.out.printf("%s ist zu hoch%n", guessedNum);
            }
        }
        System.out.printf("Richtig, die Zahl ist %s", randNum);
    }

    public static void createRandNum() {
        randNum = (int)(Math.random() * 100 + 1);
    }

}
