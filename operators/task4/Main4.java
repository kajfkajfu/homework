package Operators.task4;

public class homework4 {
    public static void main(String[] args) {
        boolean isWeekday = true;
        boolean isVacation = false;

        sleepIn(isWeekday, isVacation);
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (!weekday || vacation) {
            System.out.println("Можем спать дальше");
            return true;
        } else {
            System.out.println("Пора идти на работу");
            return false;
        }
    }
}
