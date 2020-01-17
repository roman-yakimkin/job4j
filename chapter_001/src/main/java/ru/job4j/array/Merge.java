package ru.job4j.array;

/**
 * Класс для объединения двух отсортированных массивов в третий отсортированный массив
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 16.01.2020
 * @version 1.0
 */
public class Merge {

    /**
     * Объединяет два отсортированных массива в третий отсортированный массив
     * @param left - первый отсортированный массив
     * @param right - второй отсортированный массив
     * @return result - объединение двух массивов в виде отсортированного массива
     */
    public int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int indexLeft = 0;
        int indexRight = 0;
        for (int i = 0; i < result.length; i++) {
            if (indexLeft > left.length - 1) {
                result[i] = right[indexRight];
                indexRight++;
            } else if (indexRight > right.length - 1) {
                result[i] = left[indexLeft];
                indexLeft++;
            } else if (left[indexLeft] < right[indexRight]) {
                result[i] = left[indexLeft];
                indexLeft++;
            } else {
                result[i] = right[indexRight];
                indexRight++;
            }
        }
        return result;
    }

}
