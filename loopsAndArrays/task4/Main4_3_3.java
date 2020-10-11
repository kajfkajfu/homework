package loopsAndArrays.task4;

public class Main4_3_3 {
    public static void main(String[] args) {
        int[] array = {9,1,5,99,9,9};

        Main4_2_1.bubbleSort(array);
        System.out.println("------------");

        array = new int[]{9, 1, 5, 99, 9, 9};
        Main4_2_1.cocktailSort(array);
    }
}
