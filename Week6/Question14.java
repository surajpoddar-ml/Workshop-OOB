package week6;

import java.util.ArrayList;
import java.util.Collections;

public class Question14 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(25);
        numbers.add(3);
        numbers.add(47);
        numbers.add(15);
        numbers.add(8);

        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);

        int target = 25;
        int index = Collections.binarySearch(numbers, target);

        if (index >= 0) {
            System.out.println(target + " found at index " + index);
        } else {
            System.out.println(target + " not found in the list.");
        }
    }
}
