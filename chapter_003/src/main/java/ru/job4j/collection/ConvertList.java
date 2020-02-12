package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Конвертация списка массивов в один список
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 12.02.2020
 * @version 1.0
 */
public class ConvertList {
    /**
     * Конвертировать список массивов в один список
     * @param list - список массивов
     * @return - один список
     */
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> result = new ArrayList<Integer>();
        for (int[] array: list) {
            for (int element: array) {
                result.add(element);
            }
        }
        return result;
    }
}
