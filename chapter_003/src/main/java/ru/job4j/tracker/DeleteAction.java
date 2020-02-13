package ru.job4j.tracker;

/**
 * Действие - удаление заявки
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 02.02.2020
 * @version 1.0
 */
public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete item ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        String id = input.askStr("Input item's id: ");
        if (tracker.delete(id)) {
            System.out.println("The item with id: " + id + " has been deleted");
        } else {
            System.out.println("Unable to delete the item with id: " + id);
        }
        return true;
    }
}
