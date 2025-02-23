package homework8;

import java.util.Scanner;

public class Task6 {

    public static String doubleChars(String string) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            result.append(string.charAt(i)).append(string.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String string = scanner.nextLine();
        System.out.println(doubleChars(string));
    }
}
