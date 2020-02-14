package ru.job4j.collection;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Проверка текста на уникальность
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 14.02.2020
 * @version 1.0
 */
public class UniqueText {
    public static boolean isEquals(String originalText, String duplicateText) {
        boolean rsl = true;
        String[] origin = originalText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<String>();
        check.addAll(Arrays.asList(origin));
        for (String word : text) {
            if (!check.contains(word)) {
                rsl = false;
                break;
            }
        }

        return rsl;
     }
}
