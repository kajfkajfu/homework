package siteLoader.util;

import siteLoader.SiteLoader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.*;

//5. Реализовать сохранение полученного или полученных курсов в файл.
//При запуске программы дать возможно пользователю указывать путь к файлу для сохранения курса,
//иначе курс должен сохраняться рядом рядом с запускаемой программой.

    public class CurrencyRateWriter {
    private Path path;
    private String defaultFileName = "src/siteLoader/BNB_Rates.txt";

    public void write(double rate, SiteLoader.Currency currency) {
        OpenOption option;
        if (Files.notExists(path)) {
            option = StandardOpenOption.CREATE;
        } else {
            option = StandardOpenOption.APPEND;
        }

        try (BufferedWriter writer = Files.newBufferedWriter(path, option)) {
            writer.write(currency + ": " + rate + "\n");
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public void setPathToWrite(String path) {
        if (path != null && !path.equals("")) {
            try {
                this.path = Paths.get(path);
            } catch (InvalidPathException exception) {
                System.out.println("Указаную пользователем строку пути невозможно преобразовать в путь!");
                System.out.println(exception.getMessage());
                this.path = Paths.get(defaultFileName);
            }
        } else {
            this.path = Paths.get(defaultFileName);
        }
    }
}
