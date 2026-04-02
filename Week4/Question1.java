package Week4;

class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Dog extends Animal {
    String breed;

    Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Breed: " + breed);
        System.out.println("Data processed by: Suraj");
    }
}

public class Question1 {

    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", 4, "Labrador");
        myDog.display();
    }

}