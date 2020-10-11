package strings;

public class AnotherTest {
    public static void main(String[] args) {
        int i = 222333_444;
        char[] chars = String.valueOf(i).replaceAll("\\s", "").replaceAll("_", "").toCharArray();

        for (char item: chars) {
            System.out.println(item);
        }
    }
}
