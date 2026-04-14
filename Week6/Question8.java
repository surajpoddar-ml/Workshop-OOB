package week6;

import java.util.TreeSet;

public class Question8 {
    public static void main(String[] args) {
        TreeSet<String> names = new TreeSet<>();

        names.add("Charlie");
        names.add("Alice");
        names.add("Eve");
        names.add("Bob");
        names.add("Diana");
        names.add("Alice");

        System.out.println("Names in alphabetical order: " + names);
    }
}
