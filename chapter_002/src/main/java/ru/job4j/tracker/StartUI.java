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
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        Item item;
        Item[] items;
        String id, name;
        do {
            showMenu();
            int menuItem = input.askInt("Select a number from 0 to 6  ");
            switch (menuItem) {
                case 0:
                    StartUI.createItem(input, tracker);
                    break;
                case 1:
                    StartUI.showAllItems(input, tracker);
                    break;
                case 2:
                    StartUI.replaceItem(input, tracker);
                    break;
                case 3:
                    StartUI.deleteItem(input, tracker);
                    break;
                case 4:
                    StartUI.findById(input, tracker);
                    break;
                case 5:
                    StartUI.findByName(input, tracker);
                    break;
                default:
                    StartUI.exit(input, tracker);
                    run = false;
            }
        } while (run);
    }

    /**
     * Отобразить консольное меню
     */
    private void showMenu() {
        String[] items = {"0. Add new item", "1. Show all items", "2. Edit item", "3. Delete item", "4. Find item by Id", "5. Find items by name", "6. Exit program"};
        System.out.println("Menu");
        for (String item: items) {
            System.out.println(item);
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
    private static void showItems(Item[] items) {
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
    private static void createItem(Input input, Tracker tracker) {
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
    private static void showAllItems(Input input, Tracker tracker) {
        System.out.println("=== Show all items ===");
        Item[] items = tracker.findAll();
        showItems(items);
    }

    /**
     * Заменить заявку
     * @param input - реализация интерфейса ввода
     * @param tracker - трекер
     */
    private static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Edit item ===");
        String id = input.askStr("Input item's id: ");
        Item item = tracker.findById(id);
        if (item != null) {
            String name = input.askStr("Input item's name name: ");
            item.setName(name);
            tracker.replace(item.getId(), item);
        } else {
            System.out.println("You've input incorrect item id.");
        }
    }

    /**
     * Удалить заявку
     * @param input - реализация интерфейса ввода
     * @param tracker - трекер
     */
    private static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete item ===");
        String id = input.askStr("Input item's id: ");
        tracker.delete(id);
    }

    /**
     * Найти заявку по id
     * @param input - реализация интерфейса ввода
     * @param tracker - трекер
     */
    private static void findById(Input input, Tracker tracker) {
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
    private static void findByName(Input input, Tracker tracker) {
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
    private static void exit(Input input, Tracker tracker) {
        System.out.println("=== Goodbye ===");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
