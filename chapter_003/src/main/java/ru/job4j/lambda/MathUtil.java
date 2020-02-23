package ru.job4j.lambda;

/**
 * Класс со статическими математиескими методами
 * @author Roman Yakimkin
 * @since 23.02.2020
 * @version 1.0
 */
public class MathUtil {

    /**
     * Суммировать два числа
     * @param left первое число
     * @param right второе число
     * @return результат
     */
    public static double add(int left, int right) {
        return left + right;
    }

    /**
     * Разделить одно число на другое
     * @param left - первое число
     * @param right - второе число
     * @return - результат
     */
    public static double div(int left, int right) {
        return (double) left / right;
    }
}
