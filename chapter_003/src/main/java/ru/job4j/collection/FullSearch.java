package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

/**
 * Класс для поиска задач
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 14.02.2020
 * @version 1.0
 */
public class FullSearch {
    /**
     * Получить уникальное множество номеров задач
     * @param list - коллекция задач
     * @return - множество уникальных номеров
     */
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<String>();
        for (Task task : list) {
            numbers.add(task.getNumber());
        }
        return numbers;
    }
}
