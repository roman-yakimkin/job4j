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
    private IPlayer[] players;

    /**
     * Игровой кубик
     */
    private IDice dice;

    /**
     * Маршрут игры
     */
    private IRoute route;

    private int playerIndex = -1;

    public Game(IPlayer[] players, IDice dice, IRoute route) {
        this.players = players;
        this.dice = dice;
        this.route = route;
        this.playerIndex = firstPlayerIndex();
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

    private IPlayer getCurrentPlayer() {
        return players[getPlayerIndex()];
    }

    private void nextPlayer() {
        playerIndex = 1 - playerIndex;
    }

    public void execute() {
        IPlayer player;
        do {
            player = this.getCurrentPlayer();
            int delta = player.rollDiceAndGetValue();
            System.out.println(player.getName() + " бросает кубик и выпадает " + delta);
            player.moveChip(delta);
            System.out.println(player.getName() + " передвигает фишку на " + player.getChipPosition() + " позицию");
            nextPlayer();
        } while (!getCurrentPlayer().isWon());
        System.out.println("Победил " + player.getName());
    }
}
