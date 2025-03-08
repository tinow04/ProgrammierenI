public class Automotive {
    private String brand;
    private String model;
    private float price;
    private float weight;

    Automotive(String br, String mo, float  pr, float we) {
        this.brand = br;
        this.model = mo;
        this.price = pr;
        this.weight = we;
    }

    public String toString() {
        return "brand: " + brand + ", model: " + model + ", price: " + price + ", weight: " + weight;
    }

    public static void main(String[] args) {
        Automotive car = new Automotive("BMW", "X5", 50000.9f, 2200.5f);
        System.out.println("Car: " + car);
    }

}
