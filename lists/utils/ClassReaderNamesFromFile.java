package lists.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ClassReaderNamesFromFile {

    //Класс с 1 статическим методом readAllByteJava7 считывающий
    //все данные из файлов names.txt и pet_nicks.txt

    String filePathToPersonsNames = "src/lists/utils/names.txt";
    String filePathToPetsNicks = "src/lists/utils/pet_nicks.txt";
    public String content1 = readAllBytesJava7(filePathToPersonsNames);
    public String content2 = readAllBytesJava7(filePathToPetsNicks);

    private static String readAllBytesJava7(String filePath) {
        String content = "";

        try {
            content = new String(Files.readAllBytes(Paths.get(filePath)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content;
    }
}
