package homework5;

import java.util.Scanner;

public class Homework5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть номер задачі від 1 до 5:");
        int task = Integer.parseInt(scanner.nextLine());

        switch (task) {
            case 1:
                System.out.print("Введіть свій вік: ");
                int age = scanner.nextInt();
                System.out.println(checkAge(age));
                break;
            case 2:
                System.out.print("Введіть число: ");
                int number = scanner.nextInt();
                System.out.println(isPerfectSquare(number));
                break;
            case 3:
                System.out.print("Введіть число: ");
                int n = scanner.nextInt();
                System.out.println(calculateSumUpToN(n));
                break;
            case 4:
                System.out.print("Введіть оцінку: ");
                int mark = scanner.nextInt();
                System.out.println(studentEvaluation(mark));
                break;
            case 5:
                System.out.print("Введіть просте число: ");
                int prime = scanner.nextInt();
                System.out.println(isPrime(prime));
                break;
            default:
                System.out.println("Такої задачі не існує!");
        }
    }

    //ДЗ 5.1. Чи ти дорослий?
    static String checkAge(int age) {
        if (age < 0) {
            return "Вік не може бути від'ємним!";
        } else if (age < 18) {
            return "Ви ще недорослий!";
        } else {
            return "Ви вже дорослий!";
        }
    }

    //ДЗ 5.2. Квадрат числа
    static boolean isPerfectSquare(int number) {
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }

    //ДЗ 5.3. Числовий ряд
    static String calculateSumUpToN(int n) {
        if (n < 1) {
            return "Хибні вхідні параметри";
        }
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return "Сума чисел від 1 до " + n + " дорівнює " + sum;
    }

    // ДЗ 5.4. Оцінка студента
    static String studentEvaluation (int mark) {
        switch (mark) {
            case 1 :
                return "Погано";
            case 2 :
                return "Не задовільно";
            case 3 :
                return "Задовільно";
            case 4 :
                return "Добре";
            case 5 :
                return "Відмінно";
            default :
                return "Невірна оцінка";
        }
    }

    //ДЗ 5.5. Просте число
    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
