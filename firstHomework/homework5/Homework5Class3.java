package firstHomework.homework5;

import java.util.Scanner;

public class Homework5Class3 {
    public static void main(String[] args) {
        String name;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        name = in.nextLine();

        switch (name) {
            case "Вася":
                System.out.println("Привет");
                System.out.println("Я тебя так долго ждал");
                break;
            case "Анастасия":
                System.out.println("Я тебя так долго ждал");
                break;
            default:
                System.out.println("Добрый день, а вы кто ?");
                break;
        }
    }
}
