package week6;

import java.util.HashMap;

public class Question11 {

    static void printMap(HashMap<String, String> map) {
        for (String country : map.keySet()) {
            System.out.println(country + " -> " + map.get(country));
        }
    }

    static String getCapital(HashMap<String, String> map, String country) {
        return map.get(country);
    }

    static boolean containsCapital(HashMap<String, String> map, String capital) {
        return map.containsValue(capital);
    }

    public static void main(String[] args) {
        HashMap<String, String> countryCapitals = new HashMap<>();

        countryCapitals.put("Nepal", "Kathmandu");
        countryCapitals.put("India", "New Delhi");
        countryCapitals.put("USA", "Washington D.C.");
        countryCapitals.put("Japan", "Tokyo");
        countryCapitals.put("France", "Paris");

        System.out.println("All country-capital pairs:");
        printMap(countryCapitals);

        System.out.println("Capital of Nepal: " + getCapital(countryCapitals, "Nepal"));

        System.out.println("Contains 'Tokyo': " + containsCapital(countryCapitals, "Tokyo"));
        System.out.println("Contains 'Berlin': " + containsCapital(countryCapitals, "Berlin"));

        System.out.println("Iterating through map:");
        for (String country : countryCapitals.keySet()) {
            System.out.println(country + " : " + countryCapitals.get(country));
        }
    }
}
