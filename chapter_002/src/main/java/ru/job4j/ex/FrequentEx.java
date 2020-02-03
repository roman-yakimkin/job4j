package ru.job4j.ex;

/**
 * Класс для демонстрации выбрасывания исключений
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 03.02.2020
 * @version 1.0
 */
public class FrequentEx {
    public static void main(String[] args) {
        String[] shops = {"Ebay", "Amazon", "Ozon"};
        for (int index = 0; index < shops.length; index++) {
            System.out.println(shops[index]);
        }
    }
}
