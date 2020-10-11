package LoopsAndArrays.task4;

public class Homework4point3point1 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};

        Homework4point2point1and2.bubbleSort(array);
        System.out.println("------------");

        array = new int[]{1,2,3,4,5,6};
        Homework4point2point1and2.cocktailSort(array);
    }
}
