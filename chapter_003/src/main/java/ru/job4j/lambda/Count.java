package ru.job4j.lambda;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *  Класс для подсчета количества одиннаковых чисел
 */
public class Count {

    /**
     * Подсчет количества одинаковых чисел с группировкой по числам
     * @param data - исходный список чисел
     * @return - сгруппированный список чисел
     */
    public static Map<Integer, Long> count(List<Integer> data) {
        return data.stream().collect(
                Collectors.groupingBy(n -> n, Collectors.counting())
        );
    }
}
