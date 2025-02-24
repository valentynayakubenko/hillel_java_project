package homework8;

import java.util.Scanner;

public class Task10 {

    public static int countEvenInts(int [] numbers) {
        int count = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers array:");
        String input = scanner.nextLine();

        String[] parts = input.split(", ");
        int[] numbers = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            numbers[i] = Integer.parseInt(parts[i]);
        }
        System.out.println(countEvenInts(numbers));
    }
}
