package homework6;

import java.util.Arrays;

public class BonusTasks6 {

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        int [] arr2 = {1, 2, 3, 4, 5, 6};
        int [] arr3 = {2, 10, 3, 4, 20, 5};
        int [] arr4 = {6, 2, 5, 3};
        int [] arr5 = {2, 3, 2, 2, 2, 2, 2, 2, 2, 2};

        System.out.println(countDifferencesWithin2(arr, arr2));
        System.out.println(Arrays.toString(transformArray(arr3)));
        System.out.println(Arrays.toString(leftShiftArray(arr4)));
        System.out.println(checkAdjacentTwos(arr5));
    }

    //Задача 1. Різниця між елементами у двох масивах
    public static int countDifferencesWithin2(int[] nums1, int[] nums2) {
        int count = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] != nums2[i] && Math.abs(nums1[i] - nums2[i]) <= 2) {
                count++;
            }
        }
        return count;
    }
    //Задача 2. Зміна елементів масиву при кратності 10
    public static int[] transformArray(int[] nums) {
        int multipleOf10 = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                multipleOf10 = nums[i];
            } else if (multipleOf10 != -1) {
                nums[i] = multipleOf10;
            }
        }
        return nums;
    }

    //Задача 3. "Left Shift" масиву на один елемент
    public static int[] leftShiftArray(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }

        int firstElement = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = firstElement;
        return nums;
    }

    //Задача 4. Перевірка наявності числа 2 поруч з іншим числом 2 у масиві
    public static boolean checkAdjacentTwos(int[] nums) {
        if (nums.length == 0) {
            return false; // Порожній масив відповідає умові
        }

        boolean foundTwo = true; // Чи є в масиві хоча б одна двійка

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 2) {
                foundTwo = true; // Є хоча б одна двійка

                // Перевіряємо, чи є поруч інша двійка
                if ((i > 0 && nums[i - 1] == 2) || (i < nums.length - 1 && nums[i + 1] == 2)) {
                    continue; // Все добре, двійка має сусіда
                }
                return true; // Якщо знайдена одиночна двійка
            }
        }

        return false; // Якщо двійок не було в масиві, умова виконується
    }
}
