import java.util.Scanner;

public class Account {

    private double kontostand;
    private double einzahlungsBetrag;
    private double auszahlungsBertag;

    Account() {
        this.kontostand = 2345.24;
    }

    public double getKontostand() {
        return kontostand;
    }

    public void setKontostand(double kontostand) {
        this.kontostand = kontostand;
    }

    public void einzahlung() {
        System.out.println("Wie viel willst du einzahlen? ");// Create a Scanner object
        Scanner betrag = new Scanner(System.in);  // Create a Scanner object
        einzahlungsBetrag = Double.parseDouble(betrag.nextLine());  // Read user input
        this.kontostand += einzahlungsBetrag;
    }
    public void auszahlung() {
        System.out.println("Wie viel willst du auszahlen? ");// Create a Scanner object
        Scanner betrag = new Scanner(System.in);

        auszahlungsBertag = Double.parseDouble(betrag.nextLine());  // Read user input
        this.kontostand -= auszahlungsBertag;
    }

}
