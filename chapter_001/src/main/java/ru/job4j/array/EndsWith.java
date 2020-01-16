package ru.job4j.array;

/**
 * Класс для проверки того, что одна слово заказчивается некоей символьной последовательностью
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 15.01.2020
 * @version 1.0
 */
public class EndsWith {

    /**
     * Проверка на то, что слово заказчивается определенной последовательностью
     * @param word - последовательность, представляющая слово
     * @param post - последовательность, которой должно оканчиваться слово
     * @return - истина, если слово word оканчивается последовательностью post
     */
    public static boolean endsWith(char[] word, char[] post) {
        if (word.length < post.length) {
            return false;
        }
        for (int i = 0; i < post.length; i++) {
            if (word[word.length - i - 1] != post[post.length - i - 1]) {
                return false;
            }
        }
        return true;
    }
}
