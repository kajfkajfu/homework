package siteLoader;

/**
 * Загрузчик курса с сайта Нац. Банка
 */
public class NBRBLoader extends SiteLoader {

    /**
     * Метод для запуска загрузки курса валют
     *
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(SiteLoader.Currency currencyName) {
        return load("https://www.nbrb.by/api/exrates/rates/" + currencyName.getId(), currencyName);
    }

    /**
     * Обработка результата загрузки с сайта банка
     *
     * @param content      то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */

    // 2. В классе NBRBLoader требуется дописать метод handle. При помощи данного метода в строке content вы дожны найти
    // курс валюты имя которой передали в параметре currencyName.
    // Почти обычный поиск строки currencyName по строке content (нельзя использовать регулярные выражения).
    @Override
    protected double handle(String content, SiteLoader.Currency currencyName) {
        try {
            return Double.valueOf(content.substring(content.indexOf("OfficialRate") + 14, content.indexOf('}')));
        } catch (NullPointerException exception) {
            System.out.println("Ошибка! Нам передали пустую строку.");
            return 0.0;
        } catch (NumberFormatException exception) {
            System.out.println("Ошибка! Нам передали не число в строку.");
            return 0.0;
        }
    }
}
