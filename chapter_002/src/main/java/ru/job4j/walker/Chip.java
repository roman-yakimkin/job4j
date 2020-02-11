package ru.job4j.walker;

/**
 * Класс - игральная фишка
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 11.02.2020
 * @version 1.0
 */
public class Chip implements IChip {

    /**
     * Позиция фишки
     */
    private int position = 0;

    /**
     * Ссылка на маршрут
     */
    private IRoute route;

    public Chip() { }

    /**
     * Конструктор фишки
     * @param route - ссылка на маршрут
     */
    public Chip(IRoute route) {
        this.route = route;
    }

    public int getPosition() {
        return position;
    }

    /**
     * Получить ссылку на маршрут
     * @return - ссылка на маршрут
     */
    public IRoute getRoute() {
        return route;
    }

    /**
     * Связать фишку с маршрутом
     * @param route - ссылка на маршрут
     */
    public void setRoute(IRoute route) {
        this.route = route;
    }

    /**
     * Переместить фишку
     * @param delta - расстояние, на которое перемещается фишка
     */
    public void move(int delta) {
        position += delta;
        if (position < 0) {
            position = 0;
        }
    }
}
