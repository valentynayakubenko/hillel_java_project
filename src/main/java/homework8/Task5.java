package homework8;

import java.util.Scanner;

public class Task5 {

    public static int differenceLargestSmallest(int[] numbers) {
        if (numbers.length == 0) {
            return 0;
        }
            int min = numbers[0];
            int max = numbers[0];

            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] < min) {
                    min = numbers[i];
                }
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }
            return max - min;
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
        System.out.println(differenceLargestSmallest(numbers));
    }
}
