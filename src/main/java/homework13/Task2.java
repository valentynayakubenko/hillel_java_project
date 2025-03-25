package homework13;

import java.util.HashMap;
import java.util.Map;

public class Task2 {

    public static Map<String, String> createMap(String[] strings) {
        Map<String, String> map = new HashMap<>();
        for (String string : strings) {
            String key = string.substring(0, 1);
            String value = string.substring(string.length() - 1);
            map.put(key, value);
        }
        return map;
    }

    public static void main(String[] args) {
        String[] strings = {"man", "moon", "good", "night"};
        System.out.println(createMap(strings));
    }

}
