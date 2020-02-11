package ru.job4j.walker;

/**
 * Класс - игрок
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 11.02.2020
 * @version 1.0
 */
public class Player {

    private String name;

    /**
     * Ссылка на фишку игрока
     */
    private Chip chip;

    /**
     * Ссылка на кубик
     */
    private Dice dice;

    public Player(String name, Chip chip, Dice dice, Route route) {
        this.name = name;
        this.chip = chip;
        this.dice = dice;
        chip.setPlayer(this);
        chip.setRoute(route);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Получить фишку
     * @return - ссылка на фишку
     */
    public Chip getChip() {
        return chip;
    }

    /**
     * Установить фишку игрока
     * @param chip
     */
    public void setChip(Chip chip) {
        this.chip = chip;
    }

    /**
     * Получить ссылку на кубик
     * @return ссылка на кубик
     */
    public Dice getDice() {
       return dice;
    }

    public void setDice(Dice dice) {
        this.dice = dice;
    }

    /**
     * Кинуть фишку и получить значение
     * @return
     */
    public int rollDiceAndGetValue() {
        dice.roll();
        return dice.getValue();
    }

    /**
     * переместить фишку на заданную позицию
     * @param delta
     */
    public void moveChip(int delta) {
        this.chip.move(delta);
    }

    /**
     * Выиграл ли данный игрок
     * @return истина, если выиграл
     */
    public boolean isWon() {
        return (this.chip.getPosition() >= this.chip.getRoute().getLength());
    }

}
