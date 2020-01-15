package ru.job4j.array;

/**
 * Класс для поиска минимального значения в заданом диапазоне массива
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 15.01.2020
 * @version 1.0
 */
public class MinDiapason {

    /**
     * Поиск минимального элемента массива в заданном диапазоне
     * @param data - исходный массив
     * @param start - начальный индекс диапазона
     * @param finish - конечный индекс диапазона
     * @return min - возвращает минимальный элемент в заданном диапазоне
     */
    public static int findMin(int[] data, int start, int finish){
        int min = data[start];
        for (int i=start; i<=finish; i++){
            if (data[i] < min){
                min = data[i];
            }
        }
        return min;
    }
}
