package ru.job4j.collection;

import java.util.Comparator;

/**
 * Класс - компаратор для строк
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 18.02.2020
 * @version 1.0
 */
public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result = 0;
        int lenLeft = left.length();
        int lenRight = right.length();
        for (int i = 0; i < Math.min(lenLeft, lenRight); i++) {
            result = Character.compare(left.charAt(i), right.charAt(i));
            if (result != 0) {
                break;
            }
        }
        if (result == 0) {
            result = lenLeft - lenRight;
        }
        return result;
    }
}
