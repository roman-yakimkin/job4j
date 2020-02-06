package ru.job4j.ex;

/**
 * Рекурсивное вычисление факториала
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 06.02.2020
 * @version 1.0
 */
public class FactRec {

    /**
     * Рекурсивно вычислить факториал
     * @param n - аргумент
     * @return - значение факториала
     */
    public static int calc(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return calc(n - 1) * n;
        }
    }

    public static void main(String[] args) {
        int rsl = calc(3);
        System.out.println(rsl);
    }
}
