package ru.job4j.array;

/**
 * Класс для проверки массива на заполненность одними лишь true или false
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 14.01.2020
 * @version 1.0
 */
public class Check {

    /**
     * Проверка массива на одинаковость всех элементов с помощью булевой алгебры
     * @param data - входной массив
     * @return true, если все элементы одинаковые
     */
    public boolean mono(boolean[] data) {
        boolean andByAll = true, orByAll = false;
        for (int i = 0; i < data.length; i++) {
            andByAll = andByAll && data[i];
            orByAll = orByAll || data[i];
            if (!orByAll && orByAll) {
                return false;
            }
        }
        return true;
    }

    /**
     * Проверка массива на одинаковость классическим способом
     * @param data - входной массив
     * @return true, если все элементы одинаковые
     */
    public boolean monoClassic(boolean[] data) {
        for (int i = 1; i < data.length; i++) {
            if (data[i] != data[0]) {
                return false;
            }
        }
        return true;
    }
}
