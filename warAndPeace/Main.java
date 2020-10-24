package warAndPeace;



import java.util.*;

public class Main {
    public static void main(String[] args) {
        ClassReaderFromFile classReaderFromFile = new ClassReaderFromFile();
        String[] words = classReaderFromFile.content.split("\\s");
        Set<String> uniqueWordsSet = new TreeSet<>();

        //5. Используя реализации интерфейса ISearchEngine вывести информацию
        // как часто встречаются слова "война", "и" (как союз), "мир" вне зависимости от регистра.
        EasySearch easySearch = new EasySearch();
        System.out.println(easySearch.search(classReaderFromFile.content, "Война"));
        System.out.println(easySearch.search(classReaderFromFile.content, "И"));
        System.out.println(easySearch.search(classReaderFromFile.content, "Мир"));


        //2.1 Найти все уникальные значения и поместить их в коллеккцию сет
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(",") && !words[i].equals("*") && !words[i].equals(" ") && !words[i].equals("  ")
                    && !words[i].endsWith("!") && !words[i].endsWith(",") && !words[i].endsWith(".")
                    && !words[i].endsWith("?") && !words[i].startsWith(".") && !words[i].startsWith(" ")
                    && !words[i].startsWith(",") && !words[i].startsWith("\"") && !words[i].startsWith("(")
                    && !words[i].startsWith("-") && !words[i].endsWith(")") && !words[i].endsWith(":")
                    && !words[i].endsWith("\"") && !words[i].equals("") && !words[i].equals("=")) {
                uniqueWordsSet.add(words[i]);

            }
        }

        //2.2 найти в строке топ 10 уникальных слов. Отсортировать по колличеству. Вывести в консоль
        List<String> arrayListWithWords = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(",") && !words[i].equals("*") && !words[i].equals(" ") && !words[i].equals("  ")
                    && !words[i].endsWith("!") && !words[i].endsWith(",") && !words[i].endsWith(".")
                    && !words[i].endsWith("?") && !words[i].startsWith(".") && !words[i].startsWith(" ")
                    && !words[i].startsWith(",") && !words[i].startsWith("\"") && !words[i].startsWith("(")
                    && !words[i].startsWith("-") && !words[i].endsWith(")") && !words[i].endsWith(":")
                    && !words[i].endsWith("\"") && !words[i].equals("") && !words[i].equals("=")) {
                arrayListWithWords.add(words[i]);
            }
        }

        Map<String, Integer> counterOfWords = new HashMap<>();
        for (int i = 0; i < arrayListWithWords.size(); i++) {
            counterOfWords.put(arrayListWithWords.get(i), 1);
        }
        for (Map.Entry<String, Integer> item : counterOfWords.entrySet()) {
            for (int i = 0; i < arrayListWithWords.size(); i++) {
                if (item.getKey().equals(arrayListWithWords.get(i))) {
                    item.setValue(item.getValue() + 1);
                }
            }
        }

        //2.2 Отсортировать слова по колличеству, вывести в консоль топ 10 слов
        List<Map.Entry<String, Integer>> list = new LinkedList<>(counterOfWords.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        int i = 10;
        for (Map.Entry<String, Integer> item : list) {
            if (i > 0) {
                System.out.println(item);
                i -= 1;
            }
        }
    }
}

