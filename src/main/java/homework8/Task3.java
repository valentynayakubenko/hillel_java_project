package homework8;

import java.util.Scanner;

public class Task3 {

    public static int sumIgnoreSections(int [] numbers) {
        if (numbers.length == 0)
            return 0;

        int sum = 0;
        boolean skip = false;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers [i] == 6) {
                skip = true;
                continue;
            }
            if (numbers [i] == 7 && skip) {
                skip = false;
                continue;
            }
            if (!skip) {
                sum += numbers [i];
            }

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
        System.out.println(sumIgnoreSections(numbers));
    }
}
