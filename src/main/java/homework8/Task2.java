package homework8;

import java.util.Scanner;

public class Task2 {

    public static int centeredAverage(int [] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int num : numbers) {
            sum += num;

                if (num < min) min = num;
                if (num > max) max = num;
            }
        return (sum - min - max) / (numbers.length - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers array:");
        String input = scanner.nextLine();

        String[] parts = input.split(" ");
        int[] numbers = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }
        System.out.println(centeredAverage(numbers));
    }
}
