package ru.job4j.array;

/**
 *  Класс для поиска минимального значения массива
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 15.01.2020
 * @version 1.0
 */
public class Min {

    /**
     * Поиск минимального элемента в массиве
     * @param array - исходный массив
     * @return min - возвращает минимальный элемент в массиве
     */
    public static int findMin(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
