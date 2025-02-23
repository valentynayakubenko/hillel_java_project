package homework8;

import java.util.Scanner;

public class Task7 {

    public static int countHi(String string) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'h' && i+1 < string.length() && string.charAt(i+1) == 'i') {
                count++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String string = scanner.nextLine();
        System.out.println(countHi(string));
    }

}
