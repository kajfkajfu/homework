package secondHomework.homework2;

import java.util.Arrays;
import java.util.Scanner;

public class Homework2point3point4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter array size : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.print("Enter array elements : ");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        String result = "";
        for (int i : array) {
            result = i + "\r\n" + result;
        }

        System.out.print(result);
    }
}