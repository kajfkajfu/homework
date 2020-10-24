package lists;

import java.util.Comparator;

//Класс имплементрующий интерфейс компаратор, для сравнения объектов класса Animal
//сначала по возрасту, если возраст равный, то по имени.
public class CompAnimalByAgeAndNick implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1.getAge() == o2.getAge()) {
            int i = o1.getNick().compareTo(o2.getNick());
            return i;
        } else if (o1.getAge() > o2.getAge()) {
            return 1;
        } else {
            return -1;
        }
    }
}
