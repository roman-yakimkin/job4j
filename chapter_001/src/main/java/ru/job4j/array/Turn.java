package ru.job4j.array;

/**
 * class класс для переворачивания массива
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 14.01.2020
 * @version 1.0
 */
public class Turn {

    /**
     * переворачивание входного массива
     * @param array - входной массив
     * @return array - перевернутый массив
     */
    public int[] back(int[] array) {
        int iFinish = array.length - 1;
        for (int iStart = 0; iStart < iFinish; iStart++) {
            int tmp = array[iStart];
            array[iStart] = array[iFinish];
            array[iFinish] = tmp;
            iFinish--;
        }
        return array;
    }
}
