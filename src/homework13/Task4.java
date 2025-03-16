package homework13;

import java.util.HashMap;
import java.util.Map;

public class Task4 {

    public static Map<String, String> mergeStringsByFirstChar (String[] strings) {
        Map<String, String> map = new HashMap<>();

        for (String words : strings) {
            String key = String.valueOf(words.charAt(0));
            map.put(key, map.getOrDefault(key, "") + words);
            }
        return map;
    }

    public static void main(String[] args) {
        String[] strings = {"salt", "tea", "soda", "toast"};
        System.out.println(mergeStringsByFirstChar(strings));
    }
}
