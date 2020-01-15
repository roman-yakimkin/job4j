package ru.job4j.array;

/**
 * Класс, проверяющий моностроку в таблице
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 15.01.2020
 * @version 1.0
 */
public class MatrixCheck {

    /**
     * Проверка на то, что все элементы определенной строки матрицы заполнены символами 'X'
     * @param board - символьная матрива
     * @param row - индекс строки
     * @return истина, если все элементы заполнены символами 'X'
     */
    public static boolean monoHorizontal(char[][] board, int row){
        for(int col=0; col<board[row].length; col++){
            if (board[row][col] != 'X'){
                return false;
            }
        }
        return true;
    }
}
