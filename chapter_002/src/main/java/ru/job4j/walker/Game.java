package ru.job4j.walker;

/**
 * Класс, представляющий игру
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 11.02.2020
 * @version 1.0
 */
public class Game implements IGame {

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

    /**
     * Индекс текущего игрока (0 или 1)
     */
    private int playerIndex = -1;

    public void init(IPlayer[] players, IDice dice, IRoute route) {
        this.players = players;
        this.dice = dice;
        this.route = route;
        this.playerIndex = firstPlayerIndex();
    }

    /**
     * Разыграть, кто будет первым ходить - кидать кубик, пока у одного игрока не выпадет больше, чем у другого
     * @return - индекс первого игрока
     */
    private int firstPlayerIndex() {
        int dice1, dice2;
        do {
          dice.roll();
          dice1 = dice.getValue();
          dice.roll();
          dice2 = dice.getValue();
        } while (dice1 == dice2);
        this.playerIndex = (dice1 > dice2) ? 0 : 1;
        return this.playerIndex;
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
        } while (!player.isWon());
        System.out.println("Победил " + player.getName());
    }
}
