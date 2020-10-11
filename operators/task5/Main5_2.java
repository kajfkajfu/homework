package operators.task5;

import java.util.Scanner;

public class Main5_2 {
    public static void main(String[] args) {
        String name;
        String friend = "Вася";
        String girlFriend = "Анастасия";
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя: ");
        name = in.nextLine();

        boolean checkFriend = name.equals(friend);
        boolean checkGirlFriend = name.equals(girlFriend);
        if (checkFriend) {
            System.out.println("Привет");
            System.out.println("Я тебя так долго ждал");
        } else if (checkGirlFriend) {
            System.out.println("Я тебя так долго ждал");
        } else {
            System.out.println("Добрый день, а вы кто ?");
        }
    }
}
