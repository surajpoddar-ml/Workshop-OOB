package Week4;

class Animal3 {
    String name;

    Animal3(String name) {
        this.name = name;
        System.out.println("Animal constructor called for: " + name);
    }
}

class Dog3 extends Animal3 {
    String breed;

    Dog3(String name, String breed) {
        // Using super to call the specific constructor of Animal3
        super(name);
        this.breed = breed;
        System.out.println("Dog constructor called for breed: " + breed);
    }

    void display() {
        System.out.println("Entry Detail");
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
    }
}

public class Question3 {

    public static void main(String[] args) {
        // Creating an instance of Dog3
        Dog3 myDog = new Dog3("Buddy", "Golden Retriever");
        myDog.display();
    }

}