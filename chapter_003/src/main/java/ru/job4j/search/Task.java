package ru.job4j.search;

/**
 * Класс - задача
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 12.02.2020
 * @version 1.0
 */
public class Task {
    /**
     *  Описание задачи
     */
    private String desc;
    /**
     *  Приоритет
     */
    private int priority;

    public Task(String desc, int priority) {
        this.desc = desc;
        this.priority = priority;
    }

    public String getDesc() {
        return desc;
    }

    public int getPriority() {
        return priority;
    }
}
