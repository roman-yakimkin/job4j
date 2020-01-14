package ru.job4j.array;

/**
 * Class предназначен для поиска элемента в массиве
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 14.01.2020
 * @version 1.0
 */
public class FindLoop {

    /**
     * Поиск элемента в массиве
     * @param data - массив для поиска
     * @param el - искомый элемент
     * @return result - возвращает индекс элемента или -1, если не найдено
     */
    public int indexOf(int[] data, int el){
        int result = -1;
        for (int index=0; index<data.length; index++){
            if (data[index] == el){
                result = index;
                break;
            }
        }
        return result;
    }
}
