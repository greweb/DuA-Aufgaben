public class Counter {
    protected int x; // Zählerstand
    private int savestate;
    private boolean saved;

    public Counter() { // Konstruktor
        x = 0;
    }

    public void increment() { // Hochzählen
        x++;
    }

    public int get() { // Auslesen
        return x;
    }

    public void reset() { // Zurücksetzen
        x = 0;
    }

    public void decrement() {
        if (x > 0) {
            x = x - 1;
        }
    }

    public void save() {
        savestate = x;
        saved = true;
    }

    public void restore() {
        if (saved == false)
            System.out.println("There is no savestate available!");
        else
            x = savestate;
    }
}