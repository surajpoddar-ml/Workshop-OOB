package week6;

import java.util.HashSet;
import java.util.Set;

public class Question9 {

    static Set<String> performUnion(Set<String> set1, Set<String> set2) {
        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }

    static Set<String> performIntersection(Set<String> set1, Set<String> set2) {
        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        return intersection;
    }

    static Set<String> performDifference(Set<String> set1, Set<String> set2) {
        Set<String> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        return difference;
    }

    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        set1.add("Dog");
        set1.add("Cat");
        set1.add("Elephant");
        set1.add("Lion");

        HashSet<String> set2 = new HashSet<>();
        set2.add("Cat");
        set2.add("Giraffe");
        set2.add("Dog");
        set2.add("Monkey");

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Union: " + performUnion(set1, set2));
        System.out.println("Intersection: " + performIntersection(set1, set2));
        System.out.println("Difference (set1 - set2): " + performDifference(set1, set2));
    }
}
