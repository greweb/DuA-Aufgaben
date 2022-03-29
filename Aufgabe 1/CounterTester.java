public class CounterTester {
    public static void main(String[] args) {
        Counter a = new Counter(); // Erzeugen eines Zählers a
        a.increment();
        a.increment();
        System.out.println("a:" + a.get());// a=2
        a.decrement();
        System.out.println("a:" + a.get());// a=1
        a.decrement();
        a.decrement();
        a.restore();// no savestate
        System.out.println("a:" + a.get());// a=0
        a.increment();
        a.increment();
        System.out.println("a:" + a.get());// a=2
        a.save();
        a.reset();
        System.out.println("a:" + a.get());// a=0
        a.restore();
        System.out.println("a:" + a.get());// a=2

    }
}