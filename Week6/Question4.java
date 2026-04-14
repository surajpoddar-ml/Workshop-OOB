package week6;

import java.util.Collections;
import java.util.LinkedList;

public class Question4 {
    public static void main(String[] args) {
        LinkedList<String> colors = new LinkedList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("All colors:");
        for (String color : colors) {
            System.out.println(color);
        }

        if (colors.contains("Red")) {
            System.out.println("Red exists in the list.");
        } else {
            System.out.println("Red does not exist in the list.");
        }

        Collections.shuffle(colors);
        System.out.println("Shuffled colors: " + colors);

        Collections.sort(colors);
        System.out.println("Colors in ascending order: " + colors);
    }
}
