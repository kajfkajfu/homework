package lists;

import java.util.Comparator;

//Класс имплементрующий интерфейс компаратор, для сравнения объектов класса Animal
//по возрасту.
public class CompAnimalByAge implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getAge() - o2.getAge();
    }
}
