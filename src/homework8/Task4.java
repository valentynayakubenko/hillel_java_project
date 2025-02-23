package homework8;

import java.util.Scanner;

public class Task4 {

    public static int sumWithoutUnlucky13(int [] numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number == 13) {
                break;
            }
            sum += number;
        }
        return sum;
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
        System.out.println(sumWithoutUnlucky13(numbers));
    }
}
