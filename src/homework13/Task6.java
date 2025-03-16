package homework13;

import java.util.HashMap;
import java.util.Map;

public class Task6 {

    public static int findMostFrequentNumber(int[] numbers) {
        Map<Integer, Integer> countMap = new HashMap<>();
        int maxCount = 0;
        int mostFrequent = numbers[0];

        for (int num : numbers) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);

            if (countMap.get(num) > maxCount) {
                maxCount = countMap.get(num);
                mostFrequent = num;
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 2, 2, 2, 3, 3, 3};
        System.out.println(findMostFrequentNumber(arr));
    }
}
