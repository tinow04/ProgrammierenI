/**
 * @author DHBW lecturer
 * @version 1.0
 *
 * Part of lectures on 'Programming in Java'. Baden-Wuerttemberg
 * Cooperative State University.
 *
 * (C) 2016 by J. Sidler, T. Schlachter, C. Schmitt, W. Suess
 */
public class Element {

    public static final int SOLID = 1;
    public static final int LIQUID = 2;
    public static final int GAS = 3;
    public static final String[] phases =
            { "Plasma", "fest", "flüssig", "gasförmig" };

    public static final boolean MAIN = true;
    public static final boolean SIDE = false;

    private String name;
    private String symbol;
    private int ordinal;
    private char shell;
    private int phase;
    private boolean group;

    public Element() {
    }

    public Element(String name, String symbol, int ordinal, char shell, int phase, boolean group) {
        super();
        setName(name);
        this.symbol = symbol;

        try {
            setOrdinal(ordinal);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        this.shell = shell;
        this.phase = phase;
        this.group = group;
    }

    @Override
    public String toString() {
        return name + " (" + symbol + "," + ordinal + ")" +
                " Schale: " + shell + ", " + phases[phase] +
                ", group: "	+ (group ? "Hauptgruppe" : "Nebengruppe");
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Element))
            return false;
        return ((Element) obj).getOrdinal() == ordinal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        char firstLetter = name.charAt(0);
        if (Character.isUpperCase(firstLetter)) {
            this.name = name;
        } else {
            char[] nameChars = name.toCharArray();
            nameChars[0] = Character.toUpperCase(firstLetter);
            this.name = String.valueOf(nameChars);
        }
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getOrdinal() {
        return ordinal;
    }

    public void setOrdinal(int ordinal) throws OrderException {
        if (ordinal < 1 || ordinal > 119) {
            throw new OrderException("Ordinal: " + ordinal);
        } else {
            this.ordinal = ordinal;
        }
    }

    public char getShell() {
        return shell;
    }

    public void setShell(char shell) {
        this.shell = shell;
    }

    public int getPhase() {
        return phase;
    }

    public void setPhase(int phase) {
        this.phase = phase;
    }

    public boolean isGroup() {
        return group;
    }

    public void setGroup(boolean group) {
        this.group = group;
    }

}
