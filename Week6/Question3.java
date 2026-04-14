package week6;

import java.util.ArrayList;
import java.util.Collections;

public class Question3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int positions = 2;

        System.out.println("Before rotation: " + list);
        Collections.rotate(list, positions);
        System.out.println("After rotation by " + positions + ": " + list);
    }
}
