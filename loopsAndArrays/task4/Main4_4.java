package LoopsAndArrays.task4;

import java.util.Arrays;
import java.util.Random;

public class Homework4point4 {
    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(10);
        int[] array = new int[size];

        for (int i = 0; i < array.length; i ++){
            int randomValue = random.nextInt(10);
            array[i] = randomValue;
        }

        System.out.println(Arrays.toString(array));
    }
}
