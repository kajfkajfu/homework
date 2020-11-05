package strings;

public class Main {
    public static void main(String[] args) {
        System.out.println(Strings.toString(-2.20));
        System.out.println(Strings.toString(-1.1));
        System.out.println(Strings.toString(-2_234_983.23414));
        System.out.println(Strings.toString(98_585_473.99));
        System.out.println(Strings.toString(-999_114_681D));
        System.out.println(Strings.toString(334_124_681D));

        System.out.println(Strings.toWeek(2));
        System.out.println(Strings.toWeek(7));
        System.out.println(Strings.toWeek(21));

    }
}
