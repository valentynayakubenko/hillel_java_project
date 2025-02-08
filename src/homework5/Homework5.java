package homework5;

import java.util.Scanner;

public class Homework5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть назву задачі (checkAge, isPerfectSquare, calculateSumUpToN, isStudentEvaluation, isPrime):");
        String task = scanner.nextLine();

        switch (task) {
            case "checkAge":
                testCheckAge();
                break;
            case "isPerfectSquare":
                testIsPerfectSquare();
                break;
            case "calculateSumUpToN":
                testCalculateSumUpToN();
                break;
            case "isStudentEvaluation":
                testIsStudentEvaluation();
                break;
            case "isPrime":
                testIsPrime();
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

    static void testCheckAge() {
        System.out.println(checkAge(18));
        System.out.println(checkAge(0));
        System.out.println(checkAge(99));
    }

    //ДЗ 5.2. Квадрат числа
    static boolean isPerfectSquare(int number) {
        int sqrt = (int) Math.sqrt(number);
        return sqrt * sqrt == number;
    }

    static void testIsPerfectSquare() {
        System.out.println(isPerfectSquare(25));
        System.out.println(isPerfectSquare(10));
        System.out.println(isPerfectSquare(9));
    }

    //ДЗ 5.3. Числовий ряд
    static String calculateSumUpToN(int N) {
        if (N < 1) {
            return "Хибні вхідні параметри";
        }
        int sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += i;
        }
        return "Сума чисел від 1 до " + N + " дорівнює " + sum;
    }

    static void testCalculateSumUpToN() {
        System.out.println(calculateSumUpToN(1));
        System.out.println(calculateSumUpToN(3));
        System.out.println(calculateSumUpToN(0));
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

    static void testIsStudentEvaluation() {
        System.out.println(studentEvaluation(5));
        System.out.println(studentEvaluation(1));
        System.out.println(studentEvaluation(-3));
    }

    //ДЗ 5.5. Просте число
    static boolean isPrime(int N) {
        if (N < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void testIsPrime() {
        System.out.println(isPrime(0));
        System.out.println(isPrime(8));
        System.out.println(isPrime(7));
    }

}
