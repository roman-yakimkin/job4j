package ru.job4j.tracker;

import java.util.Arrays;
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
        return Arrays.copyOf(items, position);
    }

    /**
     * Получить заявку по её идентификатору
     * @param id - идентификатор заявки
     * @return - возвращаемая заявка
     */
    public Item findById(String id) {
        for (int i = 0; i < this.position; i++) {
            if (this.items[i].getId().equals(id)) {
                Item item = this.items[i];
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
        Item[] result = new Item[position];

        for (int i = 0; i < this.position; i++) {
            if (this.items[i].getName().equals(name)) {
                result[countFound++] = new Item(this.items[i]);
            }
        }
        return Arrays.copyOf(result, countFound);
    }
}
