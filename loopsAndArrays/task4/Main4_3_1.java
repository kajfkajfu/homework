package loopsAndArrays.task4;

public class Main4_3_1 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};

        Main4_2_1.bubbleSort(array);
        System.out.println("------------");

        array = new int[]{1,2,3,4,5,6};
        Main4_2_1.cocktailSort(array);
    }
}
