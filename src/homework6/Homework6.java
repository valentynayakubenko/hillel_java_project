package homework6;

import java.util.Arrays;
import java.util.Scanner;

public class Homework6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть массив чилел через пробіл:");
        String input = scanner.nextLine();

        if (input.isEmpty()) {
            System.out.println("Масив чисел не введено!");
            return;
        }

        String[] parts = input.split(" ");
        int[] numbers = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }

        System.out.println("Введіть номер методу від 1 до 4:");
        int task = Integer.parseInt(scanner.nextLine());

        switch (task) {
            case 1:
                System.out.println("Середнє значення: " + calculateAverage(numbers));
                break;
            case 2:
                System.out.println("Мінімальне значення: " + findMinMax(numbers)[0]);
                System.out.println("Максимальне значення: " + findMinMax(numbers)[1]);
                break;
            case 3:
                System.out.println("Масив чисел в зворотньому порядку: " + Arrays.toString(printReverseArray(numbers)));
                break;
            case 4:
                System.out.println("Введіть число для перевірки його наявності у масиві:");
                int number = scanner.nextInt();
                System.out.println(isNumberInArray(numbers, number));
                break;
            default:
                System.out.println("Такий метод відсутній!");
        }
    }

    //Метод 1: знаходження середнього значення у масиві
    public static double calculateAverage(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        return (double) sum / numbers.length;
    }

    //Метод 2: знаходження максимального і мінімального значення у масиві
    public static int [] findMinMax(int[] numbers) {

        int min = numbers[0];
        int max = numbers[0];

        for (int num : numbers) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        return new int[]{min, max};
    }

    //Метод 3: виведення елементів масиву в зворотньому порядку
    public static int [] printReverseArray(int[] numbers) {
        int[] reversed = new int[numbers.length];
        int r = 0;

        for (int i = numbers.length - 1; i >= 0; i--) {
            reversed[r++] = numbers[i];
        }
        return reversed;
    }

    //Метод 4: перевірка наявності числа у масиві
    public static boolean isNumberInArray(int[] numbers, int number) {
        for (int num : numbers) {
            if (num == number) {
                System.out.println("Число " + number + " є у масиві.");
                return true;
            }
        }
        System.out.println("Число " + number + " не є у масиві.");
        return false;
    }
}
