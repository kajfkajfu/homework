package firstHomework.homework5;

import java.util.Scanner;

public class Homework5Class1 {
    public static void main(String[] args) {
        String name;
        String friend = "Вася";
        String girlFriend = "Анастасия";

        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        name = in.nextLine();

        boolean checkFriend = name.equals(friend);
        if (checkFriend) {
            System.out.println("Привет");
            System.out.println("Я тебя так долго ждал");
            return;
        }

        boolean checkGirlFriend = name.equals(girlFriend);
        if (checkGirlFriend) {
            System.out.println("Я тебя так долго ждал");
            return;
        }

        System.out.println("Добрый день, а вы кто ?");
    }
}
