package secondHomework.homework4;

import java.util.Arrays;

public class Homework4point2point1and2 {
    public static void main(String[] args) {

    }
    public static void bubbleSort(int[] mas){
        System.out.println("Before bubble sort : " + Arrays.toString(mas));

        boolean isSorted = false;
        int buf;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++){
                if (mas[i] > mas[i+1]){
                    isSorted = false;

                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }

        System.out.println("After bubble sort : " + Arrays.toString(mas));
    }

    public static void cocktailSort(int[] array){
        int left = 0;
        int right = array.length - 1;

        System.out.println("Before cocktail sort : " + Arrays.toString(array));

        do
        {
            for (int i = left; i < right; i++)
            {
                if(array[i] > array[i+1])
                {
                    array[i] ^= array[i+1];
                    array[i+1] ^= array[i];
                    array[i] ^= array[i+1];
                }
            }
            right--;

            for (int i = right; i > left ; i--)
            {
                if(array[i] < array[i-1])
                {
                    array[i] ^= array[i-1];
                    array[i-1] ^= array[i];
                    array[i] ^= array[i-1];
                }
            }
            left++;
        } while (left <= right);

        System.out.println("After cocktail sort : " + Arrays.toString(array));
    }
}
