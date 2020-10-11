package loopsAndArrays.task1;

import java.util.Scanner;

public class Main1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("please, enter two numbers : ");

        double a = sc.nextDouble();
        int b = sc.nextInt();

        while (b < 0) {
            System.out.print("please enter a positive power : ");
            b = sc.nextInt();
        }

        double result = a;

        for (int i = 1; i < b; i++) {
            result *= a;
        }
        System.out.println(result);
    }
}
