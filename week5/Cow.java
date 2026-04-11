package week5;

public class Cow implements Animal, Printable {

    @Override
    public void eat() {
        System.out.println("Cow eats grass.");
    }

    @Override
    public void walk() {
        System.out.println("Cow walks on four legs.");
    }

    @Override
    public void display() {
        System.out.println("Cow: a domestic animal that produces milk.");
    }
}