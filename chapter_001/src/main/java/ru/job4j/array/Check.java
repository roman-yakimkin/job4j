package ru.job4j.array;

/**
 * Класс для проверки массива на заполненность одними лишь true или false
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 14.01.2020
 * @version 1.0
 */
public class Check {

    /**
     * Проверка массива на одинаковость всех элементов
     * @param data - входной массив
     * @return true, если все элементы одинаковые
     */
    public boolean mono(boolean[] data){
        boolean and_by_all = true, or_by_all = false;
        for (int i = 0; i < data.length; i++){
            and_by_all = and_by_all && data[i];
            or_by_all = or_by_all || data[i];
            if (!and_by_all && or_by_all){
                return false;
            }
        }
        return true;
    }
}
