// Cow class implementing Animal and Printable interfaces
public class Cow implements Animal, Printable {
    @Override
    public void eat() {
        System.out.println("Cow is eating grass");
    }

    @Override
    public void walk() {
        System.out.println("Cow is walking");
    }

    @Override
    public void display() {
        System.out.println("Cow is a herbivorous animal.");
    }
}
