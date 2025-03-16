package homework12;

import java.util.*;

public class Homework12 {

    public static void main(String[] args) {

        List<Integer> listNumbers = new ArrayList<>();
        listNumbers.add(3);
        listNumbers.add(14);
        listNumbers.add(15);
        listNumbers.add(92);
        listNumbers.add(6);
        System.out.println("List of numbers: " + listNumbers);

        List<String> fullName = new ArrayList<>();
        fullName.add("Yakubenko");
        fullName.add("Valentyna");
        fullName.add("Yuriivna");
        System.out.println("Full Name: " + fullName);

        Set<Integer> checkUnique = new HashSet<>();
        checkUnique.add(1);
        checkUnique.add(1);
        checkUnique.add(3);
        checkUnique.add(3);
        System.out.println("Unique elements: " + checkUnique);
        System.out.println("Check size: " + checkUnique.size());

        Map<String, String> map = new HashMap<>();
        map.put("Kiev", "044");
        map.put("Kharkiv", "057");
        map.put("Dnipro", "056");
        map.put("Odessa", "048");
        map.put("Lviv", "032");
        System.out.println("Map of cities and codes: " + map);
    }

}
