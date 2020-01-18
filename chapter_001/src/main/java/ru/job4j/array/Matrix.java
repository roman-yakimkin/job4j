package ru.job4j.array;

/**
 * Класс, предназначенный для заполнения двумерного массива произведениями индексов строк и столбцов
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 15.01.2020
 * @version 1.0
 */
public class Matrix {

    /**
     * Формирование матрицы, содержащей произведения строк и столбцов
     * @param size - размер матрицы
     * @return table - матрица, содержащая произведения индексов строк и столбцов
     */
    public int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int col = 0; col < size; col++) {
            for (int row = 0; row < size; row++) {
                table[col][row] = (col + 1) * (row + 1);
            }
        }
        return table;
    }
}
