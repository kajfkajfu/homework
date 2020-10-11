package loopsAndArrays.task4;

public class Main4_3_2 {
    public static void main(String[] args) {
        int[] array = {1,1,1,1};

        Main4_2_1.bubbleSort(array);
        System.out.println("------------");

        array = new int[]{1,1,1,1};
        Main4_2_1.cocktailSort(array);
    }
}
