package lists.dontWork;

import lists.Animal;
import lists.Person;
import lists.utils.ClassReaderNamesFromFile;
import lists.utils.RandomPasswordsGenerator;

import java.util.*;


//Данный класс пока не работает. Он является попыткой реализовать задание 3.0*
//3.0* В идеале можно, используя полимормизм, написать метод под каждый созданный в первом пункте класс
// + метод который будет выполнять основную работу над любыми коллекциями. Например метод который генерирует
// Person и заполняет ими указанную вами коллекцию указанным количеством  Person.
// Получившуюся коллекцию передаём во второй метод который выполняет все остальные прописанные действия.

public class CollectionGenerator {

    ClassReaderNamesFromFile classReaderNamesFromFile = new ClassReaderNamesFromFile();
    String[] personsNames = classReaderNamesFromFile.content1.split("\\,");
    String[] animalsNames = classReaderNamesFromFile.content2.split("\\,");
    String[] passwords = RandomPasswordsGenerator.getRandomPasswords();
    Random rnd = new Random();


    //Метод генерирует объекты класс Person и заполняет имими указанную коллекцию
    //указаным количеством Person
    Collection<Person> createCollectionWithPersons(Collection<Person> collection, long counter) {
        long lStartTime = System.currentTimeMillis();

        while (counter > 0) {
            collection.add(new Person(personsNames[rnd.nextInt(personsNames.length - 1)].trim()
                    , passwords[rnd.nextInt(passwords.length - 1)]));
            counter--;
        }

        long lEndTime = System.currentTimeMillis();
        long outPut = lEndTime - lStartTime;
        System.out.println(outPut + "     " + collection.getClass());

        return collection;
    }

    //Метод генерирует объекты класс Animal и заполняет имими указанную коллекцию
    //указаным количеством Person
    Collection<Animal> createCollectionWithAnimals(Collection<Animal> collection, long counter) {
        long lStartTime = System.currentTimeMillis();

        while (counter > 0) {
            collection.add(new Animal(rnd.nextInt(10)
                    , animalsNames[rnd.nextInt(animalsNames.length - 1)].trim()));
            counter--;
        }

        long lEndTime = System.currentTimeMillis();
        long outPut = lEndTime - lStartTime;
        System.out.println(outPut + "     " + collection.getClass());

        return collection;
    }

    Collection<Person> operationsWithCollections(Collection<Person> collection){


        return collection;
    }
}
