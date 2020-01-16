package ru.job4j.array;

/**
 * Класс для проверки того, что одна слово начинается с некоей символьной последовательности
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 15.01.2020
 * @version 1.0
 */
public class ArrayChar {

    /**
     * Проверка на то, что слово начинается с определенной последовательности
     * @param word - последовательность, представляющая слово
     * @param pref - последовательность, с которой начинается или не начинается слово
     * @return истина, если слово word начинается c последовательности pref
     */
    public static boolean startsWith(char[] word, char[] pref) {
        if (word.length < pref.length) {
            return false;
        }
        for (int i = 0; i < pref.length; i++) {
            if (word[i] != pref[i]) {
                return false;
            }
        }
        return true;
    }
}
