package ru.job4j.ex;

import java.util.Arrays;

/**
 * Переворачивание массива
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 03.02.2020
 * @version 1.0
 */
public class BackArray {
    public static void main(String[] args) {
        String[] names = {"Petr", "Ivan", "Nik", "Vasya"};
        int middle = names.length / 2;
        for (int index = 0; index <= middle; index++) {
            String temp = names[index];
            names[index] = names[names.length - index - 1];
            names[names.length - index - 1] = temp;
        }
        System.out.println(Arrays.toString(names));
    }
}
