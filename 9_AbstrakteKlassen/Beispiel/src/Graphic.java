public abstract class Graphic {
    String name;
    public String getName() {
        return this.name;
    }
    abstract void draw(); // nur Methodendeklaration
} // ohne Methodenrumpf { ... }