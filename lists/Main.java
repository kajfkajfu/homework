package lists;

import lists.utils.ClassReaderNamesFromFile;
import lists.utils.RandomPasswordsGenerator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Создаём объект класса ClassReader для чтения ников из файлов
        // далее создаём 2 массива типа String[] с никами для классов Animal и Person
        // и 1 массив типа String[] с рандомными паролями для класса Person

        ClassReaderNamesFromFile classReaderNamesFromFile = new ClassReaderNamesFromFile();
        String[] personsNames = classReaderNamesFromFile.content1.split("\\,");
        String[] animalsNames = classReaderNamesFromFile.content2.split("\\,");
        String[] passwords = RandomPasswordsGenerator.getRandomPasswords();
        Random rnd = new Random();

        // Создаём 4 коллекции LinkedList<>(), ArrayList<>(), HashSet<>(), new TreeSet<>()
        // для класса Person.
        List<Person> persons1 = new LinkedList<>();
        List<Person> persons2 = new ArrayList<>();
        Set<Person> persons3 = new HashSet<>();
        Set<Person> persons4 = new TreeSet<>(new CompPersonByPassAndNick());

        // Создаём 4 коллекции LinkedList<>(), ArrayList<>(), HashSet<>(), TreeSet<>()
        // для класса Animal.
        List<Animal> Animals1 = new LinkedList<>();
        List<Animal> Animals2 = new ArrayList<>();
        Set<Animal> Animals3 = new HashSet<>();
        Set<Animal> Animals4 = new TreeSet<>(new CompAnimalByAgeAndNick());

        /* 3.1. При помощи рандома генерируем 1_000_000 (Если компьютер глючит сделать 100_000)
         * разных объектов одного класса. Поля заполняются рандомными данными.
         * 3.2. Заполняем:
         * 3.2.1. LinkedList
         * 3.2.2. ArrayList
         * 3.2.3. HashSet
         * 3.2.4. TreeSet
         *
         * 3.4. Замерить время и распечатать консоль: "Операция: ХХХХ. Заняла YYYY мс".
         * Для замера использовать метод из jdk System.currentTimeMillis():
         */

        // Заполняем LinkedList 1_000_000 объектов и смотрим сколько занимает это по времени
        // результат времени записываем в перменную outPut1.
        long lStartTime1 = System.currentTimeMillis();

        long counter1 = 1_000_000;
        while (counter1 >= 0) {
            persons1.add(new Person(personsNames[rnd.nextInt(personsNames.length - 1)].trim()
                    , passwords[rnd.nextInt(passwords.length - 1)]));
            counter1--;
        }

        long lEndTime1 = System.currentTimeMillis();
        long outPut1 = lEndTime1 - lStartTime1;


        // Заполняем ArrayList 1_000_000 объектов и смотрим сколько занимает времени,
        // результат времени записываем в перменную outPut2.
        long lStartTime2 = System.currentTimeMillis();

        long counter2 = 1_000_000;
        while (counter2 >= 0) {
            persons2.add(new Person(personsNames[rnd.nextInt(personsNames.length - 1)].trim()
                    , passwords[rnd.nextInt(passwords.length - 1)]));
            counter2--;
        }

        long lEndTime2 = System.currentTimeMillis();
        long outPut2 = lEndTime2 - lStartTime2;


        // Заполняем HashSet 1_000_000 объектов и смотрим сколько занимает времени,
        // результат времени записываем в перменную outPut3.
        long lStartTime3 = System.currentTimeMillis();

        long counter3 = 1_000_000;
        while (counter3 >= 0) {
            persons3.add(new Person(personsNames[rnd.nextInt(personsNames.length - 1)].trim()
                    , passwords[rnd.nextInt(passwords.length - 1)]));
            counter3--;
        }

        long lEndTime3 = System.currentTimeMillis();
        long outPut3 = lEndTime3 - lStartTime3;


        // Заполняем TreeSet 1_000_000 объектов и смотрим сколько занимает времени,
        // результат времени записываем в перменную outPut4.
        long lStartTime4 = System.currentTimeMillis();

        long counter4 = 1_000_000;
        while (counter4 >= 0) {
            persons4.add(new Person(personsNames[rnd.nextInt(personsNames.length - 1)].trim()
                    , passwords[rnd.nextInt(passwords.length - 1)]));
            counter4--;
        }

        long lEndTime4 = System.currentTimeMillis();
        long outPut4 = lEndTime4 - lStartTime4;


        System.out.println("Операция создание и наполнение миллона объектов класса Person в LinkedList : " + outPut1);
        System.out.println("Операция создание и наполнение миллона объектов класса Person в ArrayList : " + outPut2);
        System.out.println("Операция создание и наполнение миллона объектов класса Person в HashSet : " + outPut3);
        System.out.println("Операция создание и наполнение миллона объектов класса Person в TreeSet : " + outPut4);

        //	3.3. Отсортировать коллекции используя компараторы из задания 2.
        //	3.3.1. Сортируем встроенными средствами jdk

        //Сортируем коллекцию LinkedList, замеряем время
        long lStartTime5 = System.currentTimeMillis();

        persons1.sort(new CompPersonByPassAndNick());

        long lEndTime5 = System.currentTimeMillis();
        long outPut5 = lEndTime5 - lStartTime5;

        //Сортируем коллекцию ArrayList, замеряем время
        long lStartTime6 = System.currentTimeMillis();

        persons2.sort(new CompPersonByPassAndNick());

        long lEndTime6 = System.currentTimeMillis();
        long outPut6 = lEndTime6 - lStartTime6;

        //Сортируем коллекцию HashSet, замеряем время
        long lStartTime7 = System.currentTimeMillis();

        List<Person> sortedList = new ArrayList<>(persons3);
        Collections.sort(sortedList, new CompPersonByPassAndNick());

        long lEndTime7 = System.currentTimeMillis();
        long outPut7 = lEndTime7 - lStartTime7;

        //Сортировка коллекции TreeSet произошла сразу при наполнении её объектами

        System.out.println("Операция сортировки объектов в LinkedList " + outPut5);
        System.out.println("Операция сортировки объектов в ArrayList " + outPut6);
        System.out.println("Операция сортировки объектов в HashSet с помощью ArrayList " + outPut7);

//        for (Person person : sortedList) {
//            System.out.println(person);
//        }

        /* Итерирования коллекции:
         * 3.4.2.1. При помощи iterator
         * 3.4.2.2. При помощи любого другого способа (не foreach)
         */

        //Итератор для перебора коллекции
        Iterator<Person> iterator1 = persons1.iterator();

        //Итерирование коллекции при помощи Iterator.
        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());
        }


        //Итерирование коллекции при помощи fori.
        for (int i = 0; i < persons1.size(); i++) {
            System.out.println(persons1.get(i));
        }

        /* Удаление всех элементов коллекции:
         * 3.4.2.1. При помощи iterator
         * 3.4.2.2. При помощи любого другого способа (не foreach)
         */

        //Итератор для удаления элементов коллекции
        Iterator iterator2 = persons1.iterator();

        while (iterator2.hasNext()) {
            iterator2.next();
            iterator2.remove();
        }

    }
}
