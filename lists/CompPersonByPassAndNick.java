package lists;

import java.util.Comparator;

//Класс имплементрующий интерфейс компаратор, для сравнения объектов класса Animal
//сначала по возрасту, если возраст равный, то по имени.
public class CompPersonByPassAndNick implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getPassword().length() == o2.getPassword().length()) {
            int i;
            i = o1.getNick().compareTo(o2.getNick());
            return i;
        } else if (o1.getPassword().length() > o2.getPassword().length()) {
            return 1;
        } else return -1;
    }
}
