package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Конвертация двумерного массива в список
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 12.02.2020
 * @version 1.0
 */
public class ConvertMatrix2List {

    /**
     * Конвертация двумерного массива в список
     * @param array - двумерный массив
     * @return - список
     */
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<Integer>();
        for (int[] row : array) {
            for (int col : row) {
                list.add(col);
            }
        }
        return list;
    }
}
