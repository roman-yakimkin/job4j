package ru.job4j.collection;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

/**
 * Класс для сортировки элементов множества
 * @author Roman Yakimkin
 * @version 1.0
 * @since 17.02.2020
 */
public class TreeSort {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>(Collections.reverseOrder());
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        System.out.println(numbers);
    }
}
