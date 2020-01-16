package ru.job4j.array;

/**
 * Класс для дефрагментации массивов
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 16.01.2020
 * @version 1.0
 */
public class Defragment {

    /**
     * Дефрагментирует массив слов, смещает null-элементы к концу
     * @param array - исходный массив слов
     * @return array - возвращает дефрагментированный массив
     */
    public static String[] compress(String[] array){
        for (int index = 0; index < array.length; index++ ){
            String cell = array[index];
            if (cell == null){
                for (int j = index+1; j < array.length; j++ ){
                    array[j-1] = array[j];
                }
                array[array.length-1] = null;
            }
        }
        return array;
    }
}
