package ru.romanyakimkin;

/**
 * Класс для демонстрации некоторых функций класса Runtime
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 21.02.2020
 * @version 1.0
 */
public class RuntimeDemo {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        System.out.println("Всего памяти = " + r.totalMemory());
        System.out.println("Свободно памяти = " + r.freeMemory());
        int[] i = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        System.out.println("Свободно памяти = " + r.freeMemory());
    }
}
