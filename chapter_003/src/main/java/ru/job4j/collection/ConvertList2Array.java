package ru.job4j.collection;

import java.util.List;

/**
 * Класс для конвертации списка чисел в двумерный массив
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 12.02.2020
 * @version 1.0
 */
public class ConvertList2Array {
    public static int[][] toArray(List<Integer> list, int cells) {
        int groups = (int) Math.ceil((double) list.size() / cells);
        System.out.println(groups);
        int[][] array = new int[groups][cells];
        int row = 0, col = 0;
        for (Integer num : list) {
            array[row][col++] = num;
            if (col == cells) {
                row++;
                col = 0;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7);
        int[][] result = toArray(list, 3);
        for (int[] row: result) {
            for (int cell: row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}
