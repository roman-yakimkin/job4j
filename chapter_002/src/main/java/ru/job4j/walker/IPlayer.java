package ru.job4j.walker;

/**
 * Интерфейс - игрок
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 11.02.2020
 * @version 1.0
 */
public interface IPlayer {
    String getName();
    int rollDiceAndGetValue();
    void moveChip(int delta);
    int getChipPosition();
    boolean isWon();
}
