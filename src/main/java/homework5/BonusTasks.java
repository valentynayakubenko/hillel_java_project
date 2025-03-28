package homework5;

public class BonusTasks {

    public static void main(String[] args) {
        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[1]);
        int number3 = Integer.parseInt(args[2]);

        System.out.println(checkNumberSign(number1));
        System.out.println(checkNumberSign(number2));
        System.out.println(checkNumberSign(number3));
        System.out.println(" ");

        int dayNumber = Integer.parseInt(args[3]);
        int dayNumber2 = Integer.parseInt(args[4]);
        int dayNumber3 = Integer.parseInt(args[5]);
        int dayNumber4 = Integer.parseInt(args[6]);

        System.out.println(getWeekday(dayNumber));
        System.out.println(getWeekday(dayNumber2));
        System.out.println(getWeekday(dayNumber3));
        System.out.println(getWeekday(dayNumber4));
        System.out.println(" ");

        int number4 = Integer.parseInt(args[7]);
        int number5 = Integer.parseInt(args[8]);
        int number6 = Integer.parseInt(args[9]);

        System.out.println(printEvenNumbers(number4));
        System.out.println(printEvenNumbers(number5));
        System.out.println(printEvenNumbers(number6));

    }
    //Задача 1. Тип числа
    public static char checkNumberSign(int number) {
        if (number > 0) {
            return '+';
        } else if (number < 0) {
            return '-';
        } else {
            return '0';
        }
    }

    //Задача 2. День тижня
    public static String getWeekday(int dayNumber) {

        switch (dayNumber) {
            case 1 : return "Понеділок";
            case 2 : return "Вівторок";
            case 3 : return "Середа";
            case 4 : return "Четверг";
            case 5 : return "П'ятниця";
            case 6 : return "Субота";
            case 7 : return "Неділя";
            default: return "-1";
        }
    }

    //Задача 3. Парні числа
    public static String printEvenNumbers(int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 2; i <= n; i += 2) {
            result.append(i).append(" ");
        }
        return result.toString().trim();
    }
}
