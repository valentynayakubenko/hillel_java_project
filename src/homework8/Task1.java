package homework8;

import java.util.Scanner;

public class Task1 {

    public static boolean catDog(String string) {
        int catCount = 0;
        int dogCount = 0;

        for (int i = 0; i < string.length() - 3; i++) {
           String subString = string.substring(i, i + 3);
           if (subString.equals("cat")) {
               catCount++;
            }
           if (subString.equals("dog")) {
               dogCount++;
            }
        }
        return catCount == dogCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string:");
        String word = scanner.nextLine();
        System.out.println(catDog(word));
    }
}
