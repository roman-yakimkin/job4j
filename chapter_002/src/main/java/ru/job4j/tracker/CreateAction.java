package ru.job4j.tracker;

/**
 * Действие - создать заявку
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 02.02.2020
 * @version 1.0
 */
public class CreateAction implements UserAction {

    @Override
    public String name() {
        return "=== Create a new Item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String name = input.askStr("Input item's name ");
        Item item = new Item(name);
        tracker.add(item);
        return true;
    }
}
