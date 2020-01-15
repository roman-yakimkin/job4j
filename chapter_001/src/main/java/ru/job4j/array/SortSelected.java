package ru.job4j.array;

/**
 * Класс для сортировки массива методом простого выбора
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 15.01.2020
 * @version 1.0
 */
public class SortSelected {

    /**
     * Сортировка массива методом простого выбора
     * @param data - исходный массив
     * @return отсотрированный по возрастанию массив
     */
    public static int[] sort(int[] data){
        FindLoop findLoop = new FindLoop();
        for (int i=0; i < data.length; i++){
            int minValue = MinDiapason.findMin(data, i, data.length-1);
            int minIndex = findLoop.indexOf(data, minValue, i, data.length-1);
            int tmp = minValue;
            data[minIndex] = data[i];
            data[i] = tmp;
        }
        return data;
    }
}
