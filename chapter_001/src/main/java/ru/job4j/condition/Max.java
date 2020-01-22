package ru.job4j.condition;

/**
 * Класс для определения максимума из чисел
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 15.01.2020
 * @version 1.1
 */
public class Max {

    /**
     * Получение максимального числа из двух чисел
     * @param first - первое число
     * @param second - второе число
     * @return - максимум из двух чисел
     */
    public static int max(int first, int second) {
        return (first > second) ? first : second;
    }

    /**
     * Получение максимума из трех чисел
     * @param first - первое число
     * @param second - второе число
     * @param third - третье число
     * @return - максимум из трех чисел
     */
    public static int max(int first, int second, int third) {
        return max(first, max(second, third));
    }

    /**
     *  Получение максимума из четырех чисел
     * @param first - первое число
     * @param second - второе число
     * @param third - третье число
     * @param fourth - четвертое число
     * @return - максимум из четырех чисел
     */
    public static int max(int first, int second, int third, int fourth) {
        return max(first, max(second, third, fourth));
    }
}