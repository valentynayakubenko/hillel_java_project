package homework7;

import java.util.Arrays;
import java.util.Scanner;

public class Homework7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть номер задачі від 1 до 5:");
        int task = Integer.parseInt(scanner.nextLine());

        switch (task) {
            case 1:
                System.out.println("Введіть слово");
                String word = scanner.nextLine();
                System.out.println("Введіть число");
                int repeat = scanner.nextInt();
                System.out.println(repeatEnd(word, repeat));
                break;
            case 2:
                System.out.println("Введіть слово 1");
                String line1 = scanner.nextLine();
                System.out.println("Введіть слово 2");
                String line2 = scanner.nextLine();
                System.out.println(mixLine(line1, line2));

                break;
            case 3:
                System.out.println("Введіть рядок символів");
                String line = scanner.nextLine();
                System.out.println("Введіть символи які потрібно знайти в середині рядка");
                String symbols = scanner.nextLine();
                System.out.println(symbolsInTheMiddleLine(line, symbols));
                break;
            case 4:
                System.out.println("Введіть рядок символів із 'zip' та 'zap'");
                String lineZipZap = scanner.nextLine();
                System.out.println(removeSymbolsInZipZap(lineZipZap));
                break;
            case 5:
                System.out.println("Введіть рядок символів");
                String lineXYZ = scanner.nextLine();
                System.out.println(containsXYZ(lineXYZ));
                break;
        }
    }

    //ДЗ 7.1.
    public static String repeatEnd(String word, int repeat) {
        StringBuilder result = new StringBuilder();
        String end = word.substring(word.length() - repeat);

        for (int i = 0; i < repeat; i++) {
            result.append(end);
        }

        return result.toString();
    }

    //ДЗ 7.2.
    public static String mixLine(String line1, String line2) {
        StringBuilder result = new StringBuilder();
        int length = Math.min(line1.length(), line2.length());

        for (int i = 0; i < length; i++) {
            result.append(line1.charAt(i)).append(line2.charAt(i));
        }

        if (line1.length() > length) {
            result.append(line1.substring(length));
        }
        if (line2.length() > length) {
            result.append(line2.substring(length));
        }

        return result.toString();
    }

    //ДЗ 7.3.
    public static boolean symbolsInTheMiddleLine(String line, String symbols) {
        int countLine = line.length();
        int countSymbols = symbols.length();

        if (countLine == 0 && countSymbols == 0) {
            return false;
        }

        for (int i = 0; i <= countLine - countSymbols; i++) {
            if (line.substring(i, i + countSymbols).equals(symbols)) {
                int left = i;
                int right = countLine - (i + countSymbols);

                if (Math.abs(left - right) <= 1) {
                    return true;
                }
            }
        }

        return false;
    }

    //ДЗ 7.4.
    public static String removeSymbolsInZipZap(String line) {
        return line.replaceAll("z.p", "zp");
    }

    //ДЗ 7.5.
    public static boolean containsXYZ(String line) {
        for (int i = 0; i <= line.length() - 3; i++) {
            if (line.startsWith("xyz", i) && (i == 0 || line.charAt(i - 1) != '.')) {
                    return true;
                }
        }
        return false;
    }

}

