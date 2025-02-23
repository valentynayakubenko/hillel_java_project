package homework8;

import java.util.Scanner;

public class Task9 {

    public static boolean endsWith(String string1, String string2) {

        string1 = string1.toLowerCase();
        string2 = string2.toLowerCase();

        return string1.endsWith(string2) || string2.endsWith(string1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string 1");
        String string1 = scanner.nextLine();

        System.out.println("Enter string 2");
        String string2 = scanner.nextLine();
        System.out.println(endsWith(string1, string2));
    }
}
