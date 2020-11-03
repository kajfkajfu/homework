package siteLoader;

import siteLoader.util.CurrencyRateWriter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Создаём объект класса NBRBLoader, наследника SiteLoader
        //Создаём объект класса Scanner
        SiteLoader loader = new NBRBLoader();
        Scanner scanner = new Scanner(System.in);

        //Создаём объект класс CurrencyRateWriter
        //Просим пользователя ввести путь / название файла либо нажать enter чтоб создать файл с дефолтным именеи и путём
        //В аргумент метода .setPathToWrite() вводим строку которая будет нашим именем файла / путём куда сохраним  курс валют
        CurrencyRateWriter nbrbToFileWriter = new CurrencyRateWriter();
        System.out.println("Введите путь / название файла или нажмите enter чтоб создать дефолтный фал");
        nbrbToFileWriter.setPathToWrite(scanner.nextLine());

        //В переменную типа double rateEUR записываю курс ЕВРО
        //rateEUR вывожу на консоль
        //с помощью объекта класса CurrencyRateWriter - nbrbToFileWriter вызвается метод write() где есть 2 аргумента
        //double курс валюты и enum - название валюты, метод записывает курс валюты в файл по дефолтному или указаному
        //пути и сохроняет файл с информацией с дефолтным именем или с именем из передоным в .setPathToWrite()
        double rateEUR = loader.load(SiteLoader.Currency.EUR);
        System.out.println(rateEUR);
        nbrbToFileWriter.write(rateEUR, SiteLoader.Currency.EUR);

        double rateRUB = loader.load(SiteLoader.Currency.RUB);
        System.out.println(rateRUB);
        nbrbToFileWriter.write(rateRUB, SiteLoader.Currency.RUB);

        double rateUSD = loader.load(SiteLoader.Currency.USD);
        System.out.println(rateUSD);
        nbrbToFileWriter.write(rateRUB, SiteLoader.Currency.USD);
    }
}
