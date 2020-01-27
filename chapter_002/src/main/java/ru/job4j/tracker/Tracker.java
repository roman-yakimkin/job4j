package ru.job4j.tracker;

import java.util.Random;

/**
 * Класс - трекер заявок
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 26.01.2020
 * @version 1.0
 */
public class Tracker {

    /**
     * Массив для хранения заявок
     */
    private final Item[] items = new Item[100];

    /**
     * Указатель ячейки для новой заявки
     */
    private int position = 0;

    /**
     * Генерация уникального ключа для заявки
     * @return сгенерированный уникальный ключ
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }

    /**
     * Добавить заявку в хранилище
     * @param item - добавляемая заявка
     * @return - добавленная заявка
     */
    public Item add(Item item) {
        item.setId(this.generateId());
        items[this.position++] = item;
        return item;
    }

    /**
     * Получть все заявки
     * @return массив заявок
     */
    public Item[] findAll() {
        Item[] result = new Item[this.position];
        for (int i = 0; i < this.position; i++) {
            result[i] = new Item(this.items[i]);
        }
        return result;
    }

    /**
     * Получить заявку по её идентификатору
     * @param id - идентификатор заявки
     * @return - возвращаемая заявка
     */
    public Item findById(String id) {
        for (int i = 0; i < this.position; i++) {
            if (this.items[i].getId().equals(id)) {
                Item item = new Item(this.items[i]);
                return item;
            }
        }
        return null;
    }

    /**
     * Получить список заявок по их имени
     * @param name - имя заявки
     * @return - список заявок
     */
    public Item[] findByName(String name) {
        int countFound = 0;
        Item[] result = null;
        for (int i = 0; i < this.position; i++) {
            if (this.items[i].getName().equals(name)) {
                countFound++;
            }
        }
        if (countFound > 0) {
            result = new Item[countFound];
            int resultIndex = 0;
            for (int i = 0; i < this.position; i++) {
                if (this.items[i].getName().equals(name)) {
                    result[resultIndex++] = new Item(this.items[i]);
                }
            }
        }
        return result;
    }
}
