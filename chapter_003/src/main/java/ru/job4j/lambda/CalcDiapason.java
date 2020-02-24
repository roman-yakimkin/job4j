package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Вычисление функции в диапазоне
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 24.02.2020
 * @version 1.0
 */
public class CalcDiapason {

    /**
     * Вычисление значений в диапазоне
     * @param start - начало диапазона
     * @param end - конец диапазона
     * @param func - интерфейс для лямбда - функции
     * @return - список вычисленных значений
     */
    public List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> result = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            result.add(func.apply((double) i));
        }
        return result;
    }
}
