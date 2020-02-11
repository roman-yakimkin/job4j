package ru.job4j.walker;

/**
 * Класс, представляющий игру
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 11.02.2020
 * @version 1.0
 */
public class Game {

    /**
     * Список пользователей
     */
    private Player[] players;

    /**
     * Игровой кубик
     */
    private Dice dice;

    /**
     * Маршрут игры
     */
    private Route route;

    private int playerIndex = -1;

    public Game(String name1, String name2, int routeLength) {
        route = new Route(routeLength);
        dice = new Dice();
        Player player1 = new Player(name1, new Chip(), dice, route);
        Player player2 = new Player(name2, new Chip(), dice, route);
        players = new Player[]{player1, player2};
        playerIndex = firstPlayerIndex();
    }

    private int firstPlayerIndex() {
        int dice1, dice2;
        do {
          dice.roll();
          dice1 = dice.getValue();
          dice.roll();
          dice2 = dice.getValue();
        } while (dice1 == dice2);
        return (dice1 > dice2) ? 0 : 1;
    }

    private int getPlayerIndex() {
        return playerIndex;
    }

    private Player getCurrentPlayer() {
        return players[getPlayerIndex()];
    }

    private void nextPlayer() {
        playerIndex = 1 - playerIndex;
    }

    public void execute() {
        Player player;
        do {
            player = getCurrentPlayer();
            int delta = player.rollDiceAndGetValue();
            System.out.println(player.getName() + " бросает кубик и выпадает " + delta);
            player.moveChip(delta);
            System.out.println(player.getName() + " передвигает фишку на " + player.getChip().getPosition() + " позицию");
            nextPlayer();
        } while (!getCurrentPlayer().isWon());
        System.out.println("Победил " + player.getName());
    }
}
