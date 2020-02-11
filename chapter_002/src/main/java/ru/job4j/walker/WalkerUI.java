package ru.job4j.walker;

/**
 * Класс для запуска игры - ходилки
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 11.02.2020
 * @version 1.0
 */
public class WalkerUI {

    public static void main(String[] args) {
        Game game = new Game("First player", "Second player", 100);
        game.execute();
    }
}
