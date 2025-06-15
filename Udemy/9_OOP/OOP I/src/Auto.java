public class Auto {

    int reifen;
    int preis;

    String marke;

    public Auto() {

    }

    public Auto(int reifen, int preis, String marke) {
        this.reifen = reifen;
        this.preis = preis;
        this.marke = marke;
    }

    public void gas() {
        System.out.println("Das Auto der Marke '" + this.marke + "' fährt los.");
    }
}
