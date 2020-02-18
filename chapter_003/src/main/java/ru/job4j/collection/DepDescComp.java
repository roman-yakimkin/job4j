package ru.job4j.collection;

import java.util.Comparator;

/**
 * Компаратор для сортировки департаментов по убыванию
 */
public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        int result = 0;
        String[] parts1 = s1.split("/");
        String[] parts2 = s2.split("/");
        for (int i = 0; i < Math.min(parts1.length, parts2.length); i++) {
            result = parts2[i].compareTo(parts1[i]);
            if (result != 0) {
                break;
            }
        }
        if (result == 0) {
            result = parts1.length - parts2.length;
        }
        return result;
    }
}
