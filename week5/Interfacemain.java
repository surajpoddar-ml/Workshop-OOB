package week5;

public class Interfacemain {
    public static void main(String[] args) {
        System.out.println("=== Cow ===");
        Cow cow = new Cow();
        cow.eat();
        cow.walk();
        cow.display();

        System.out.println("\n=== Fish ===");
        Fish fish = new Fish();
        fish.specialFeature();

        System.out.println("\n=== Bird ===");
        Bird bird = new Bird();
        bird.specialFeature();
    }
}