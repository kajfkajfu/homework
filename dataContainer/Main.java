package dataContainer;

public class Main {
    public static void main(String[] args) {
        DataContainer<Integer> dataContainer = new DataContainer<>(new Integer[2]);
        SomeComparator comparator = new SomeComparator();
        dataContainer.add(10);
        dataContainer.add(20);
        dataContainer.add(30);
        dataContainer.add(40);

        System.out.println(dataContainer.toString());
        System.out.println(dataContainer.delete(0));
        System.out.println(dataContainer.toString());
        System.out.println(dataContainer.delete((Integer) 30));
        System.out.println(dataContainer.toString());

        dataContainer.add(14);
        dataContainer.add(11);
        dataContainer.add(22);

        System.out.println(dataContainer.toString());
        dataContainer.sort(comparator);
        System.out.println(dataContainer.toString());
    }
}
