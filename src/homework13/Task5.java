package homework13;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task5 {

    public static String buildResultString(String[] strings) {
        Map<String, Integer> countMap = new HashMap<>();
        Set<String> addedStrings = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (String str : strings) {

            int count = countMap.getOrDefault(str, 0) + 1;
            countMap.put(str, count);

            if (count % 2 == 0 && !addedStrings.contains(str)) {
                result.append(str);
                addedStrings.add(str);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String[] strings = {"a", "b", "a", "c", "a", "d", "a"};
        System.out.println(buildResultString(strings));

    }
}
