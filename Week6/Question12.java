package week6;

import java.util.Arrays;
import java.util.Collections;

public class Question12 {
    public static void main(String[] args) {
        Integer[] numbers = {5, 2, 8, 1, 9, 3};

        Arrays.sort(numbers);
        System.out.println("Ascending order: " + Arrays.toString(numbers));

        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending order: " + Arrays.toString(numbers));
    }
}
