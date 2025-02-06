package homework4;

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Обчислення квадрата числа
        System.out.print("Введіть ціле число: ");
        int number = scanner.nextInt();
        System.out.println("Квадрат числа " + number + " дорівнює " + (number * number) + ".");

        // 2. Обчислення об'єму циліндра
        double radius = 3.5;
        double height = 10.0;
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("Об'єм циліндра з радіусом " + radius + " і висотою " + height + " дорівнює " + volume + ".");

        // 3. Піднесення до степеня
        System.out.print("Введіть a: ");
        int a = scanner.nextInt();
        System.out.print("Введіть b: ");
        int b = scanner.nextInt();
        System.out.println("Результат " + a + "^" + b + " дорівнює " +  Math.pow(a, b) + ".");
    }
}
