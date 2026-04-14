package week6;

import java.util.HashMap;

public class Question10 {
    public static void main(String[] args) {
        HashMap<String, String> contacts = new HashMap<>();

        contacts.put("Alice", "9800000001");
        contacts.put("Bob", "9800000002");
        contacts.put("Charlie", "9800000003");
        contacts.put("Diana", "9800000004");

        System.out.println("Contacts:");
        for (String name : contacts.keySet()) {
            System.out.println(name + " : " + contacts.get(name));
        }
    }
}
