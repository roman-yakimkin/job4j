package ru.job4j.array;

/**
 * Class предназначен для поиска элемента в массиве
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 14.01.2020
 * @version 1.1
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

    /**
     * Поиск элемента в массиве в определенном диапазоне
     * @param data - массив для поиска
     * @param el - искомый элемент
     * @param start - индекс, с которого начинается поиск
     * @param finish - индекс, которым оканчивается поиск
     * @return result - возвращает индекс элемента или -1, если не найдено
     */
    public int indexOf(int[] data, int el, int start, int finish){
        int result = -1;
        start = (start < 0) ? 0 : start;
        finish = (finish > data.length-1) ? data.length-1 : finish;
        for (int index=start; index<finish; index++){
            if (data[index] == el){
                result = index;
                break;
            }
        }
        return result;
    }
}
