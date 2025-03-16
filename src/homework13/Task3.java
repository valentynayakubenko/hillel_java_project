package homework13;

import java.util.HashMap;
import java.util.Map;

public class Task3 {

    public static Map<String, Integer> countWords  (String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String words : strings) {
            if (map.containsKey(words)) {
                map.put(words, map.get(words) + 1);
            } else {
                map.put(words, 1);
            }
        }
        return map;
    }

    public static void main(String[] args) {
        String[] strings = {"a", "b", "a", "c", "b"};
        System.out.println(countWords(strings));
    }
}
