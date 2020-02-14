package ru.job4j.collection;

/**
 * Класс, реализующий задачу
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 14.02.2020
 * @version 1.0
 */
public class Task {
    /**
     * Номер задачи
      */
    private String number;
    /**
     * Описание задачи
     */
    private String description;

    /**
     * Конструктор
     * @param number - номер задачи
     * @param description - описание задачи
     */
    public Task(String number, String description) {
        this.number = number;
        this.description = description;
    }

    /**
     * Вернуть номер задачи
     * @return номер задачи
     */
    public String getNumber() {
        return this.number;
    }
}
