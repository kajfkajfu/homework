package LoopsAndArrays.task4;

import java.util.Arrays;
import java.util.Scanner;

public class Homework4point5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter array size : ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.print("Please enter arrays's elements : ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(array));
    }
}
