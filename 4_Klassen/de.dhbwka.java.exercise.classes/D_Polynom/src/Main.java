public class Main {
    public static void main(String[] args) {
        Polynomial Poly = new Polynomial(2,4,-8,2);
        Polynomial Poly2 = new Polynomial(-3, 5, -7, 1);

        Poly.printFunc();
        System.out.println();
        Poly.calcFunc();
        System.out.println();
        Poly.addFunc(Poly2);
        System.out.println();
        Poly.mitternachtsformel();

    }
}