package dataContainer;

import java.util.Arrays;
import java.util.Comparator;

public class DataContainer<T> {
    private T[] data; //Внутренний массив для хранения передоваемых объектов

    public DataContainer(T[] data) {
        this.data = data;
    }

    public void setData(T[] data) {
        this.data = data;
    }

    public int add(T item) { //метод добавляет данные во внутреннее поле дата
        if (data[data.length - 1] != null) {
            T[] copy = Arrays.copyOf(data, data.length + 1);
            data = copy;
        }
        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = item;
                return i;
            }
        }
        return -1;
    }

    public T get(int index) {  //метод возвращает значение из контейнера по индексу
        if (index >= data.length || index < 0) {
            return null;
        }
        return data[index];
    }

    public T[] getItems() {
        return this.data;
    }

    public boolean delete(int index) {
        if (index >= data.length || index < 0) {
            return false;
        } else {
            T[] tmp = Arrays.copyOf(data, data.length - 1);
            for (int i = 0; i < index; i++) {
                tmp[i] = data[i];
            }
            for (int i = index + 1; i <= tmp.length; i++) {
                tmp[i - 1] = data[i];
            }
            data = tmp;
            return true;
        }
    }

    public boolean delete(T item) {
        for (int i = 0; i < data.length; i++) {
            if (data[i] == item) {
                for (int j = i; j < data.length - 1; j++) {
                    data[j] = data[j + 1];
                }
                T[] tmp = Arrays.copyOf(data, data.length - 1);
                data = tmp;
                return true;
            }
        }
        return false;
    }

public void sort(Comparator<T> comparator) {
    T tmp;
    for (int i = 0; i < this.data.length - 1; i++) {
        for (int j = 0; j < this.data.length - 1; j++) {
            if (comparator.compare(this.data[j], this.data[j + 1]) > 0) {
                tmp = this.data[j];
                this.data[j] = this.data[j + 1];
                this.data[j + 1] = tmp;
            }
        }
    }
}

    @Override
    public String toString() {
        return "DataContainer{" +
                "data=" + Arrays.toString(data) +
                '}';
    }
}
