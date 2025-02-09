public class Main {
    public static void main(String[] args) {

        Account Tino = new Account();

        System.out.println("Kontostand: " + Tino.getKontostand() + "€");
        Tino.einzahlung();
        System.out.println("Neuer Kontostand: " + Tino.getKontostand() + "€");
        Tino.auszahlung();
        System.out.println("Neuer Kontostand: " + Tino.getKontostand() + "€");

    }
}