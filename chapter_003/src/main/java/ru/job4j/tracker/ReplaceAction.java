package ru.job4j.tracker;

/**
 * Действие - замена заявки
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 02.02.2020
 * @version 1.0
 */
public class ReplaceAction implements UserAction {
    @Override
    public String name() {
        return "=== Edit item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Input item's id: ");
        String name = input.askStr("Input item's name name: ");
        if (tracker.replace(id, new Item(id, name))) {
            System.out.println("The item with id: " + id + " has been replaced with new name: " + name);
        } else {
            System.out.println("Unable to replace the item with id: " + id);
        }
        return true;
    }
}
