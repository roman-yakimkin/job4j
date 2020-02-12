package ru.job4j.walker;

/**
 * Класс для запуска игры - ходилки
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 11.02.2020
 * @version 1.0
 */
public class WalkerUI {

    public static void main(String[] args) {
        IRoute route = new Route(100);
        IDice dice = new Dice();
        IPlayer[] players = new IPlayer[2];
        players[0] = new Player("First Player", new Chip(), dice, route);
        players[1] = new Player("Second Player", new Chip(), dice, route);

        IGame game = new Game();
        game.init(players, dice, route);
        game.execute();
    }
}
