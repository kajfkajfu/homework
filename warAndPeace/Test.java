package warAndPeace;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
//        String text = "Hello J best Java language of programming j java";
//        System.out.println(text.substring(7));
//        System.out.println(search(text, "J"));
    }

    static long search(String text, String word) {
        text = " "+text.toLowerCase()+" ";
        word = word.toLowerCase();
        long counter = 0;
        boolean condition = true;

        while (condition) {
            if (text.indexOf(word) > 0) {
                String preWordIndex = String.valueOf(text.charAt(text.indexOf(word) - 1));
                String postWordIndex = String.valueOf(text.charAt(text.indexOf(word) + word.length()));
                if ((preWordIndex.startsWith(" ") || preWordIndex.startsWith(",") || preWordIndex.startsWith(".")
                        || preWordIndex.startsWith("(") || preWordIndex.startsWith("{") || preWordIndex.startsWith("[")
                        || preWordIndex.startsWith("-") || preWordIndex.startsWith("\n"))
                        && (postWordIndex.endsWith(" ") || postWordIndex.endsWith(",") || postWordIndex.endsWith(".")
                        || postWordIndex.endsWith(")") || postWordIndex.endsWith("{") || postWordIndex.endsWith("[")
                        || postWordIndex.endsWith("-") || postWordIndex.endsWith("\n")))
                    counter++;
            }
            text = text.substring(text.indexOf(word) + word.length());
            if (text.indexOf(word) == -1) {
                condition = false;
            }
        }
        return counter;
    }
}
