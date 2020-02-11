package ru.job4j.walker;

/**
 * Класс - игральная фишка
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 11.02.2020
 * @version 1.0
 */
public class Chip {

    /**
     * Позиция фишки
     */
    private int position = 0;

    /**
     * Ссылка на игрока
     */
    private Player player;

    /**
     * Ссылка на маршрут
     */
    private Route route;

    public Chip() { }

    /**
     * Конструктор фишки
     * @param player - ссылка на игрока
     * @param route - ссылка на маршрут
     */
    public Chip(Player player, Route route) {
        this.player = player;
        this.route = route;
    }

    public int getPosition() {
        return position;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    /**
     * Получить ссылку на маршрут
     * @return - ссылка на маршрут
     */
    public Route getRoute() {
        return route;
    }

    /**
     * Связать фишку с маршрутом
     * @param route - ссылка на маршрут
     */
    public void setRoute(Route route) {
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
