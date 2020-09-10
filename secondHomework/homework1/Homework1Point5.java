package secondHomework.homework1;

public class Homework1Point5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 2; j <= 5; j++) {
                System.out.printf("%d  * %2d = %2d   ", j, i, j * i);
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 1; i <= 10; i++) {
            for (int j = 6; j <= 9; j++) {
                System.out.printf("%d  * %2d = %2d   ", j, i, j * i);
            }
            System.out.println();
        }
    }
}
