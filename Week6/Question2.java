package week6;

import java.util.LinkedList;

public class Question2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("Is the list empty? " + list.isEmpty());

        list.addFirst(10);
        list.addLast(20);
        list.addFirst(5);
        list.addLast(30);

        System.out.println("LinkedList: " + list);
        System.out.println("Is the list empty? " + list.isEmpty());
    }
}
