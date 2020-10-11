package loopsAndArrays.task2;

import java.util.Scanner;

public class Main2_1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter array size : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.print("Enter array elements : ");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int index = 0;

        do {
            System.out.print(array[index++] + " ");
        } while (index < array.length);
    }
}
