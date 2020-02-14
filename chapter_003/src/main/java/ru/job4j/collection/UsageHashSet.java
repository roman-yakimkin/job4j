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
        HashSet<String> autos = new HashSet<String>();
        autos.add("Lada");
        autos.add("BMW");
        autos.add("Volvo");
        autos.add("Toyota");
        for (String auto : autos) {
            System.out.println(auto);
        }
    }
}
