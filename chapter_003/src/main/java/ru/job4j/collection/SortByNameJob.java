package ru.job4j.collection;

import java.util.Comparator;

/**
 * Класс для реализации сортировки по имени через интерфейс Comparator
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 17.02.2020
 * @version 1.0
 */
public class SortByNameJob implements Comparator<Job> {
    @Override
    public int compare(Job first, Job second) {
        return first.getName().compareTo(second.getName());
    }
}
