package week6;

import java.util.ArrayList;

public class Question1 {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Alice");
        students.add("Bob");
        students.add("Charlie");
        students.add("Diana");
        students.add("Eve");

        students.remove("Charlie");

        System.out.println("Updated list of participants: " + students);
    }
}
