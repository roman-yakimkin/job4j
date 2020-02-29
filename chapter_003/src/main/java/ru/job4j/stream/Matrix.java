package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Класс - матрица
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @version 1.0
 * @since 1.0
 */
public class Matrix {

    /**
     * Преобразование матрицы в список
     * @param matrix - матрица
     * @return - список
     */
    public static List<Integer> transformToList(Integer[][] matrix) {
        return Stream.of(matrix).flatMap(Stream::of).collect(Collectors.toList());
    }
}
