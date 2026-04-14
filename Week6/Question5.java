package week6;

import java.util.Stack;

public class Question5 {
    public static void main(String[] args) {
        Stack<String> tasks = new Stack<>();

        tasks.push("Read");
        tasks.push("Write");
        tasks.push("Code");

        System.out.println("Popped task: " + tasks.pop());

        tasks.push("Debug");
        tasks.push("Test");

        System.out.println("Top task (peek): " + tasks.peek());

        System.out.println("Stack: " + tasks);
    }
}
