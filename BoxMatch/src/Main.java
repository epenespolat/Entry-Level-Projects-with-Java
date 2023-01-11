public class Main {
    public static void main(String[] args) {

        Boxers f1 = new Boxers("A", 120, 100,30);
        Boxers f2 = new Boxers("B", 85, 85,40);

        BoxingRing ring = new BoxingRing(f1, f2, 85, 100);

        ring.run();
    }

}
