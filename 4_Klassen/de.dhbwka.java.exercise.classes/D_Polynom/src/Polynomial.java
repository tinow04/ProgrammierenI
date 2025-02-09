public class Polynomial {

    private float x;
    private float a;
    private float b;
    private float c;

    public Polynomial(float x, float a, float b, float c) {
        this.x = x;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void printFunc() {
        System.out.printf("f(x) = %.2fx^2 + %.2fx + %.2f", a, b, c);
    }

    public void calcFunc() {
        float f = a * (x * x) + b * x + c;
        System.out.printf("f(%.2f) = %.4f", x, f);
    }

    public void addFunc(Polynomial other) {
        float sumA = this.a + other.a;
        float sumB = this.b + other.b;
        float sumC = this.c + other.c;

        System.out.printf("added Polynom: f(x) = %.2fx^2 + %.2fx + %.2f", sumA, sumB, sumC);
    }

    public void mitternachtsformel() {
        float null1, null2;

        float root = (b * b) - (4 * a * c);
        if (root < 0) {
            System.out.println("Die Gleichung hat keine reellen Nullstellen.");
        } else {
            null1 = (float) ((-b + Math.sqrt(root)) / (2 * a));
            null2 = (float) ((-b - Math.sqrt(root)) / (2 * a));
            System.out.printf("Die Nullstellen sind: x1 = %.3f; x2 = %.3f", null1, null2);
        }
    }
}
