package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

/**
 * Действие - отображение всех заявок
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 02.02.2020
 * @version 1.0
 */
public class ShowAllAction implements UserAction {

    @Override
    public String name() {
        return "=== Show all items ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        List<Item> items = tracker.findAll();
        if (items.size() > 0) {
            for (Item item: items) {
                System.out.println("ID: " + item.getId() + ", name: " + item.getName());
            }
        } else {
            System.out.println("No items");
        }
        return true;
    }
}