package ru.job4j.ex;

/**
 * Класс - сумматор
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 04.02.2020
 * @version 1.0
 */
public class Count {
    /**
     * Вычислить сумму последовательности чисел
     * @param start - начальное число
     * @param finish - конечное число
     * @return - сумма
     */
    public static int add(int start, int finish) {
        if (start > finish) {
            throw new IllegalArgumentException("Start should be less than finish");
        }
        int rsl = 0;
        for (int index = start; index != finish; index++) {
            rsl += index;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println("Sum of 2 to 10 is :" + add(10, 2));
    }
}
