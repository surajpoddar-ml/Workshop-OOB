package week6;

import java.util.ArrayDeque;

public class Question7 {
    public static void main(String[] args) {
        ArrayDeque<String> printQueue = new ArrayDeque<>();

        printQueue.add("Document1");
        printQueue.add("Document2");
        printQueue.add("Document3");

        System.out.println("Dequeued: " + printQueue.poll());

        printQueue.add("Document4");
        printQueue.add("Document5");

        System.out.println("Next print job (peek): " + printQueue.peek());

        System.out.println("Print jobs in queue: " + printQueue);
    }
}
