package ru.job4j.tracker;

import java.util.Scanner;

/**
 * Реализация консольного интерфейса для трекера заявок
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 30.01.2020
 * @version 1.0
 */
public class StartUI {

    /**
     * Инициализация и цикл работы консольного интерфейса
     * @param scanner - класс - сканнер
     * @param tracker - класс - трекер
     */
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        Item item;
        Item[] items;
        String id, name;
        do {
            showMenu();
            int menuItem = Integer.parseInt(scanner.nextLine());
            switch (menuItem) {
                case 0:
                    System.out.println("=== Create a new item ===");
                    System.out.print("Input item's name ");
                    name = scanner.nextLine();
                    item = new Item(name);
                    tracker.add(item);
                    break;
                case 1:
                    System.out.println("=== Show all items ===");
                    items = tracker.findAll();
                    showItems(items);
                    break;
                case 2:
                    System.out.println("=== Edit item ===");
                    System.out.print("Input item's id: ");
                    id = scanner.nextLine();
                    item = tracker.findById(id);
                    if (item != null) {
                        System.out.print("Input item's name name: ");
                        name = scanner.nextLine();
                        item.setName(name);
                        tracker.replace(item.getId(), item);
                    } else {
                        System.out.println("You've input incorrect item id.");
                    }
                    break;
                case 3:
                    System.out.println("=== Delete item ===");
                    System.out.print("Input item's id: ");
                    id = scanner.nextLine();
                    tracker.delete(id);
                    break;
                case 4:
                    System.out.println("=== Find item by id ===");
                    System.out.print("Input item's id: ");
                    id = scanner.nextLine();
                    item = tracker.findById(id);
                    if (item != null) {
                        showItem(item);
                    }
                    break;
                case 5:
                    System.out.println("=== Find item by name ===");
                    System.out.print("Input items' name: ");
                    name = scanner.nextLine();
                    items = tracker.findByName(name);
                    if (items != null) {
                        showItems(items);
                    }
                    break;
                default:
                    System.out.println("=== Goodbye ===");
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
        System.out.println("Select a number from 0 to 6 ");
    }

    /**
     * Show one item
     * @param item - an item
     */
    private void showItem(Item item) {
        if (item != null) {
            System.out.println("ID: " + item.getId() + ", name: " + item.getName());
        }
    }

    /**
     * Show array of items
     * @param items array of items;
     */
    private void showItems(Item[] items) {
        if (items.length > 0) {
            for (Item item: items) {
                this.showItem(item);
            }
        } else {
            System.out.println("No items");
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
