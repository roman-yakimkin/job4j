package ru.job4j.walker;

/**
 * Интерфейс - игра
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 12.01.2020
 * @version 1.0
 */
public interface IGame {
    void init(IPlayer[] players, IDice dice, IRoute route);
    void execute();
}
