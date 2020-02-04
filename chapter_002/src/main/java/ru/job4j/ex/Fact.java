package ru.job4j.ex;

/**
 * Класс для вычисления факториала
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 04.02.2020
 * @version 1.0
 */
public class Fact {
    public static void main(String[] args) {

    }

    /**
     * Вычисление факториала
     * @param n - аргумент
     * @return - значение факториала
     */
    public int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Argument for factorial must be 0 or more");
        }
        int rsl = 1;
        for (int index = 1; index != n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
