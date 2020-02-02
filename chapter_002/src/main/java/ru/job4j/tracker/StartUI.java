package ru.job4j.tracker;

import ru.job4j.oop.Transport;

/**
 * Реализация консольного интерфейса для трекера заявок
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 30.01.2020
 * @version 2.0
 */
public class StartUI {

    /**
     * Инициализация и цикл работы консольного интерфейса
     * @param input - реализация интерфейса "сканер"
     * @param tracker - класс - трекер
     */
    public void init(Input input, Tracker tracker, UserAction[] actions) {
        boolean run = true;
        do {
            showMenu(actions);
            int menuItem = input.askInt("Select a number from 0 to 6  ");
            UserAction action = actions[menuItem];
            run = action.execute(input, tracker);
        } while (run);
    }

    /**
     * Отобразить консольное меню
     */
    private void showMenu(UserAction[] actions) {
        String[] items = {"0. Add new item", "1. Show all items", "2. Edit item", "3. Delete item", "4. Find item by Id", "5. Find items by name", "6. Exit program"};
        System.out.println("Menu");
        for (int i=0; i < actions.length; i++) {
            System.out.println(i + ". " + actions[i].name());
        }
    }

    /**
     * Show one item
     * @param item - an item
     */
    private static void showItem(Item item) {
        if (item != null) {
            System.out.println("ID: " + item.getId() + ", name: " + item.getName());
        }
    }

    /**
     * Show array of items
     * @param items array of items;
     */
    public static void showItems(Item[] items) {
        if (items.length > 0) {
            for (Item item: items) {
                showItem(item);
            }
        } else {
            System.out.println("No items");
        }
    }

    /**
     * Создать одну заявку
     * @param input - реализация интерфейса ввода
     * @param tracker - трекер
     */
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new item ===");
        String name = input.askStr("Input item's name ");
        Item item = new Item(name);
        tracker.add(item);
    }

    /**
     * Отобразить все заявки
     * @param input - реализация интерфейса ввода
     * @param tracker - трекер
     */
    public static void showAllItems(Input input, Tracker tracker) {
        System.out.println("=== Show all items ===");
        Item[] items = tracker.findAll();
        showItems(items);
    }

    /**
     * Заменить заявку
     * @param input - реализация интерфейса ввода
     * @param tracker - трекер
     */
    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ===");
        String id = input.askStr("Input item's id: ");
        String name = input.askStr("Input item's name name: ");
        if (tracker.replace(id, new Item(id, name))) {
            System.out.println("The item with id: " + id + " has been replaced with new name: " + name);
        } else {
            System.out.println("Unable to replace the item with id: " + id);
        }
    }

    /**
     * Удалить заявку
     * @param input - реализация интерфейса ввода
     * @param tracker - трекер
     */
    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ===");
        String id = input.askStr("Input item's id: ");
        if (tracker.delete(id)) {
            System.out.println("The item with id: " + id + " has been deleted");
        } else {
            System.out.println("Unable to delete the item with id: " + id);
        }
    }

    /**
     * Найти заявку по id
     * @param input - реализация интерфейса ввода
     * @param tracker - трекер
     */
    public static void findById(Input input, Tracker tracker) {
        System.out.println("=== Find item by id ===");
        String id = input.askStr("Input item's id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            showItem(item);
        }
    }

    /**
     * Найти заявки по имени
     * @param input - реализация интерфейса ввода
     * @param tracker - трекер
     */
    public static void findByName(Input input, Tracker tracker) {
        System.out.println("=== Find item by name ===");
        String name = input.askStr("Input items' name: ");
        Item[] items = tracker.findByName(name);
        if (items != null) {
            showItems(items);
        }
    }

    /**
     * Завершить работу
     * @param input - реализация интерфейса ввода
     * @param tracker - трекер
     */
    public static void exit(Input input, Tracker tracker) {
        System.out.println("=== Goodbye ===");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(),
                new ShowAllAction(),
                new ReplaceAction(),
                new DeleteAction(),
                new FindByIdAction(),
                new FindByNameAction(),
                new ExitAction()
        };
        new StartUI().init(input, tracker, actions);
    }
}
