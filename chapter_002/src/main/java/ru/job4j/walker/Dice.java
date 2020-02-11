package ru.job4j.walker;

import java.util.Random;

/**
 * Класс - игральная кость
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 11.02.2020
 * @version 1.0
 */
public class Dice {

    /**
     * Значение на кубике
     */
    private int value = 0;

    /**
     * Конструктор кости
     */
    public Dice() {
        roll();
    }

    /**
     * Метнуть кубик
     */
    public void roll() {
        Random random = new Random();
        value = random.nextInt(6) + 1;
    }

    /**
     * Получить значение на кубике
     * @return - значение на кубике
     */
    public int getValue() {
        return value;
    }

}
