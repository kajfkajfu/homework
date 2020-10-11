package LoopsAndArrays.homework1;

public class Homework1Point2 {
    public static void main(String[] args) {
        int result = 1;
        int length = args[0].length();
        String value = args[0];
        int[] array = new int[length];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(String.valueOf(value.charAt(i)));
        }

        for (int i = 0; i < array.length; i++) {
            result = result * array[i];
            if (i == array.length - 1) {
                System.out.print(array[i] + " = ");
                break;
            }
            System.out.print(array[i] + " * ");
        }
        System.out.print(result);
    }
}
