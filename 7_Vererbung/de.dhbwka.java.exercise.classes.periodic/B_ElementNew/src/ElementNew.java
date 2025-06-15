public class ElementNew {
    public static final int SOLID = 1;
    public static final int LIQUID = 2;
    public static final int GAS = 3;
    public static final String[] phases =
            { "Plasma", "fest", "flüssig", "gasförmig" };

    public static final boolean MAIN = true;
    public static final boolean SIDE = false;

    String name;
    String symbol;
    int ordinal;
    char shell;
    int phase;
    boolean group;

    public ElementNew(String name, String symbol, int ordinal, char shell, int phase, boolean group) {
        this.name = name;
        this.symbol = symbol;
        this.ordinal = ordinal;
        this.shell = shell;
        this.phase = phase;
        this.group = group;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof ElementNew))
            return false;
        return ((ElementNew) obj).getOrdinal() == ordinal;
    }

    private int getOrdinal() {
        return ordinal;
    }

    public String toString() {
        return "name: " + name + ", symbol: " + symbol + ", ordinal: " + ordinal + ", shell: " + shell + ", phase: " + phase + ", group: " + group;

    }
}