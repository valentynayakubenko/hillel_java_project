package homework13;

import java.util.LinkedHashSet;

public class Task7 {

    public static void main(String[] args) {
        LinkedHashSet<Integer> first = new LinkedHashSet<>();
        first.add(1);
        first.add(2);
        first.add(3);
        first.add(4);

        LinkedHashSet<Integer> second = new LinkedHashSet<>();
        second.add(3);
        second.add(5);
        second.add(6);

        LinkedHashSet<Integer> intersection = new LinkedHashSet<>(first);
        intersection.retainAll(second);

        boolean result = !intersection.isEmpty();
        System.out.println(result);
    }
}
