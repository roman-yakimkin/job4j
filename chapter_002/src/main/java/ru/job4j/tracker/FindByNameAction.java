package ru.job4j.tracker;

/**
 * Действие - поиск заявки по имени
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 02.02.2020
 * @version 1.0
 */
public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "=== Find item by name ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Input items' name: ");
        Item[] items = tracker.findByName(name);
        if (items.length > 0) {
            for (Item item: items) {
                System.out.println("ID: " + item.getId() + ", name: " + item.getName());
            }
        } else {
            System.out.println("No items");
        }
        return true;
    }
}
