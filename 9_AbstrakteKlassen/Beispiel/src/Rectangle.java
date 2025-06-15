public class Rectangle extends Graphic {
    float width, height;
    public Rectangle(String str, float w, float h) {
        this.name = str;
        this.width = w;
        this.height = h;
    }
    // geerbt: getName - ist bereits in Graphic implementiert
    void draw() { // wird erst hier implementiert
        System.out.println("Rectangle: " + this.name);
    }
// weitere Methoden...
}