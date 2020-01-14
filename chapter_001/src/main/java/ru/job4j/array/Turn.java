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
    public int[] back(int[] array){

        int i_finish = array.length - 1;
        for (int i_start = 0; i_start < i_finish; i_start++){
            int tmp = array[i_start];
            array[i_start] = array[i_finish];
            array[i_finish] = tmp;
            i_finish--;
        }
        return array;
    }
}
