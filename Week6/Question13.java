package week6;

import java.util.ArrayList;
import java.util.Collections;

public class Question13 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Purple");

        Collections.sort(colors);
        System.out.println("Ascending order: " + colors);

        colors.sort(Collections.reverseOrder());
        System.out.println("Descending order: " + colors);
    }
}
