package LoopsAndArrays.homework2;

import java.util.Scanner;

public class Homework2point3point2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please, enter array size : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.print("Enter array elements : ");

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        int index = array.length - 1;

        while (index >= 0){
            System.out.print(array[index--] + " ");
        }
    }
}
