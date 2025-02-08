package homework4;

import java.util.Scanner;

public class Homework4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Обчислення квадрата числа
        System.out.print("Введіть ціле число: ");
        int number = scanner.nextInt();
        int squareResult = calculateSquare(number);
        System.out.println("Квадрат числа " + number + " дорівнює " + squareResult + ".");

        // 2. Обчислення об'єму циліндра
        double radius = 3.5;
        double height = 10.0;
        double volume = calculateCylinderVolume(radius, height);
        System.out.println("Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює " + volume + ".");

        // 3. Піднесення до степеня
        System.out.print("Введіть a: ");
        int a = scanner.nextInt();
        System.out.print("Введіть b: ");
        int b = scanner.nextInt();
        int powerResult = calculatePower(a, b);
        System.out.println("Результат " + a + "^" + b + " дорівнює " + powerResult + ".");
    }

    // 1. Метод обчислення квадрата числа
    static int calculateSquare(int number) {
        return number * number;
    }

    // 2. Метод обчислення об'єму циліндра
    static double calculateCylinderVolume(double radius, double height) {
        return Math.PI * Math.pow(radius, 2) * height;
    }


    // 3. Метод піднесення до степеня
    static int calculatePower(int a, int b) {
        return (int) Math.pow(a, b);
    }

}

