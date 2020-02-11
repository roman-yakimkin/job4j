package ru.job4j.walker;

/**
 * Интерфейс - фишка
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 11.02.2020
 * @version 1.0
 */
public interface IChip {
    void move(int delta);
    int getPosition();
}
