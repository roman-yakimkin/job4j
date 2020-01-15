package ru.job4j.array;

/**
 * Класс, проверяющий моностроку и моностолбец в таблице
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 15.01.2020
 * @version 1.1
 */
public class MatrixCheck {

    /**
     * Проверка на то, что все элементы определенной строки матрицы заполнены символами 'X'
     * @param board - символьная матрица
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

    /**
     * Проверка на то, что все элементы определенного столбца матрицы заполнены символами 'X'
     * @param board - символьная матрица
     * @param col - индекс столбца
     * @return истина, если все элементы заполнены символами 'X'
     */
    public static boolean monoVertical(char[][] board, int col){
        for(int row=0; row<board.length; row++){
            if (board[row][col] != 'X'){
                return false;
            }
        }
        return true;
    }
}
