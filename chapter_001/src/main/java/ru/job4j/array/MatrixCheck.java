package ru.job4j.array;

/**
 * Класс для экспериментов с символьной матрицей
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 15.01.2020
 * @version 1.3
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

    /**
     * Возвращает диагональные элементы матрицы в виде одномерного массива
     * @param board - исходная символьная матрица
     * @return result - одномерный массив, состоящий из диагональных элементов
     */
    public static char[] extractDiagonal(char[][] board){
        char[] result = new char[board.length];
        for (int i=0; i<board.length; i++){
            result[i] = board[i][i];
        }
        return result;
    }

    /**
     * Проверяет наличие выигрышной ситуации в матрице размером 5*5 элементов
     * @param board - символьная матрица
     * @return истина, если найдена выигрышная ситуация
     */
    public static boolean isWin(char[][] board){
        for (int i=0; i<board.length; i++){
            if (monoHorizontal(board, i) || monoVertical(board, i)) {
                return true;
            }
        }
        return false;
    }


}
