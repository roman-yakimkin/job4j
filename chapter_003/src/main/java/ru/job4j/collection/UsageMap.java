package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс для демонстрации использования HashMap
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 14.02.2020
 * @version 1.0
 */
public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("parsentiev@yandex.ru", "Petr Arsentiev");
        map.put("r.yakimkin@yandex.ru", "Roman Yakimkin");
        map.put("udi@mail.ru", "Dmitry Uzhegov");
        System.out.println("Output via keyset =====");
        for (String key: map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " => " + value);
        }

        System.out.println("Output via entrySet =====");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " => " + value);
        }

        map.remove("parsentiev@yandex.ru");

        System.out.println("Output after a element was removed =====");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " => " + value);
        }
    }
}