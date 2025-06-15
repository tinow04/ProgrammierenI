public class Main {
    public static void main(String[] args) {
        Auto bmw = new Auto();

        bmw.preis = 40000;
        bmw.marke = "BMW";
        bmw.reifen = 4;

        System.out.println("Marke: " + bmw.marke + ", Preis: " + bmw.preis + ", Reifen: " + bmw.reifen);

        Auto audi = new Auto(4, 50000, "Audi");

        System.out.println("Marke: " + audi.marke + ", Preis: " + audi.preis + ", Reifen: " + audi.reifen);

        audi.gas();
    }
}