package ru.job4j.walker;

/**
 * Класс - маршрут
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 11.02.2020
 * @version 1.0
 */
public class Route implements IRoute {

    /**
     * Длина маршрута
     */
    private int length;

    public Route(int length) {
        this.length = length;
    }

    /**
     * Получить длину маршрута
     * @return длина маршрута
     */
    public int getLength() {
        return length;
    }
}