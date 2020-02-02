package ru.job4j.tracker;

/**
 * Интерфейс действий пользователя
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 02.02.2020
 * @version 1.0
 */
public interface UserAction {
    String name();
    boolean execute(Input input, Tracker tracker);
}
