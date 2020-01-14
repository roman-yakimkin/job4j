package ru.job4j.array;

/**
 *  Class Используется для формирования массива квадратов чисел
 *  @author Roman Yakimkin (r.yakimkin@yandex.ru)
 *  @since 14.01.2020
 *  @version 1.0
 */
public class Square {

    /**
     * Получение массива квадратов элементов
     * @param bound количество элементов
     * @return result массив квадратов элементов
     */
    public int[] calculate(int bound){
        int[] result = new int[bound];
        for(int i=0; i<bound; i++){
            result[i] = (i+1)*(i+1);
        }
        return result;
    }
}
