package ru.job4j.collection;

import java.util.ArrayList;

/**
 * Класс для демонстрации использования коллекций
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 11.02.2020
 * @version 1.0
 */
public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Petr");
        names.add("Ivan");
        names.add("Stephan");
        for (String name: names) {
            System.out.println(name);
        }
    }
}
