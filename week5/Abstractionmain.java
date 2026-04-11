package week5;

public class Abstractionmain {
    public static void main(String[] args) {
        System.out.println("=== Quadrilateral ===");
        Quadrilateral q = new Quadrilateral(4, 5, 4, 5);
        q.calculateArea();
        q.calculatePerimeter();

        System.out.println("\n Bus");
        Bus bus = new Bus();
        bus.wheel();
        bus.door();
    }
}