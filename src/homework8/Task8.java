package homework8;

import java.util.Scanner;

public class Task8 {

    //Задача полягає в підрахунку кількості входжень підрядка "code" у вказаному рядку,
    // при цьому приймаються будь-які літери для символу 'd'.
    // Отже, рядки "cope" і "cooe" також вважаються входженням "code".

    public static int countCode(String string) {
        int count = 0;
        for (int i = 0; i< string.length(); i++){
            if (string.charAt(i) == 'c'
                    && string.charAt(i+1) == 'o'
                    && string.charAt(i+3) == 'e') {
                count++;
            }
    }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string");
        String string = scanner.nextLine();
        System.out.println(countCode(string));
    }
}
