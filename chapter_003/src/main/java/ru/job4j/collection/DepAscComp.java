package ru.job4j.collection;

import java.util.Comparator;

/**
 * Компаратор для сортировки департаментов по возрастанию
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 18.02.2020
 * @version 1.0
 */
public class DepAscComp implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        return s1.compareTo(s2);
    }
}
