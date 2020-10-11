package warAndPeace;


//4.1 Написать класс EasySearch. Реализовать поиск используя метод indexOf из класса String.
//В данной реализации запрещено использовать регулярные выражения в любом виде, для любых задач.
public class EasySearch implements ISearchEngine {
    @Override
    public long search(String text, String word) {
        text = " " + text.toLowerCase() + " ";
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
