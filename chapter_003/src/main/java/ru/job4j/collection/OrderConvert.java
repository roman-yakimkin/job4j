package ru.job4j.collection;

import java.util.HashMap;
import java.util.List;

/**
 * Класс для преобразования списка заявок в карту
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 14.02.2020
 * @version 1.0
 */
public class OrderConvert {
    /**
     * Преобразование списка заявок в карту
     * @param orders - список заявок
     * @return - карта заявок с ключом по номеру заявки
     */
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        for (Order order : orders) {
            map.put(order.getNumber(), order);
        }
        return map;
    }
}
