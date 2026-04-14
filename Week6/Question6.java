package week6;

import java.util.Stack;

public class Question6 {
    public static void main(String[] args) {
        String sentence = "Hello World";
        Stack<String> stack = new Stack<>();

        String[] words = sentence.split(" ");
        for (String word : words) {
            stack.push(word);
        }

        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
            if (!stack.isEmpty()) {
                reversed.append(" ");
            }
        }

        System.out.println("Original: " + sentence);
        System.out.println("Reversed: " + reversed);
    }
}
