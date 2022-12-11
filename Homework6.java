package Homework6;

import java.util.*;

public class Homework6 {
    public static void main(String[] args) {
        // 1. Реализовать множество (set) с помощью TreeMap.
        System.out.println("\n1. Объявить и инициализировать множества TreeSet:");
        Set<Integer> ts = new TreeSet<>();
        System.out.println(ts + " - TreeSet (ts)");

        // 2. Создать метод add, добавляющий элемент (использовал добавление 10 элементов) в ваше множество.
        System.out.println("\n2. Создать метод add, добавляющий элемент в ваше множество:");
        ts.addAll(rndmList(10));
        System.out.println("ts: " + ts);

        // 3. Объявить и инициализировать компаратор с обратной (от большего к меньшеиу) логикой сортировки чисел.
        // 4. Объявить и инициализировать TreeSet использующий ваш компаратор.
        // 5. Добавить несколько эллементов в сет и вывести в консоль.
        // А можно все в одном? (Объявить, инициализировать, добавить, развернуть и вывести в консоль)
        System.out.println("\n3. Объявить и инициализировать компаратор с обратной (от большего к меньшеиу) логикой сортировки чисел:");
        Set<Integer> ts1 = new TreeSet<>(new Comparator<Integer>() {
            public int compare(Integer i1,Integer i2)
            {
                return i2.compareTo(i1);
            }
        });
        ts1.addAll(rndmList(10));
        System.out.println("ts1: " + ts1 + "\n");
    }



    // 2.

    private static List<Integer> rndmList(int sizeList) {
        List<Integer> rndList = new ArrayList<>();
        while (rndList.size() < sizeList) {
            rndList.add((int) (Math.random() * 100));
        }
        return rndList;

}
}
