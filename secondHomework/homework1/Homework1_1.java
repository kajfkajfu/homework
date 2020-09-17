package secondHomework.homework1;


public class Homework1_1 {
    public static void main(String[] args) {
        int result = 1;
        int arg = Integer.parseInt(args[0]);

        if (arg <= 15) {
            int[] array = new int[arg];

            for (int i = 1; i <= arg; i++) {
                array[i - 1] = i;
                result = result * i;
            }

            for (int i = 0; i < array.length; i++) {
                if (array[i] == array.length) {
                    System.out.print(array[i] + " = ");
                    break;
                }
                System.out.print(array[i] + " * ");
            }
            System.out.print(result);
        }
        else {
            System.out.println("You used a value bigger than 15");
            System.out.println("Please use a value less than 15");
        }
    }
}
