package ru.job4j.collection;

import java.util.HashSet;

/**
 * Класс - простейший пример использования коллекции - множества
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @version 1.0
 * @since 14.02.2020
 */
public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<String>();
        names.add("Petr");
        names.add("Ivan");
        names.add("Ivan");
        names.add("Vasily");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
