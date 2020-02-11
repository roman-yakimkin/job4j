package ru.job4j.walker;

/**
 * Класс - игрок
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 11.02.2020
 * @version 1.0
 */
public class Player implements IPlayer {

    private String name;

    /**
     * Ссылка на фишку игрока
     */
    private IChip chip;

    /**
     * Ссылка на кубик
     */
    private IDice dice;

    /**
     * Ссылка на маршрут
     */
    private IRoute route;

    public Player(String name, IChip chip, IDice dice, IRoute route) {
        this.name = name;
        this.chip = chip;
        this.dice = dice;
        this.route = route;
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
    public IChip getChip() {
        return chip;
    }

    /**
     * Установить фишку игрока
     * @param chip
     */
    public void setChip(IChip chip) {
        this.chip = chip;
    }

    /**
     * Получить ссылку на кубик
     * @return ссылка на кубик
     */
    public IDice getDice() {
       return dice;
    }

    public void setDice(IDice dice) {
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
     * Получить позицию фишки
     * @return позиция фишки игрока
     */
    public int getChipPosition() {
        return chip.getPosition();
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
        return (this.chip.getPosition() >= this.route.getLength());
    }

}
