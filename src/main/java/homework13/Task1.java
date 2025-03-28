package homework13;

import java.util.HashMap;
import java.util.Map;

public class Task1 {

    public static Map<String, Integer> getLengthOfStrings (String[] strings) {
        Map<String, Integer> map = new HashMap<>();
        for (String string : strings) {
            map.put(string, string.length());
        }
        return map;
    }

    public static void main(String[] args) {
        String[] strings = {"code", "code", "code", "bug"};
        System.out.println(getLengthOfStrings(strings));
    }
}
