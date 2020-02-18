package ru.job4j.sort;

import java.util.Arrays;

/**
 * Механизм возврата денег в лендиноговых аппаратах
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 08.02.2020
 * @version 1.0
 */
public class Machine {
    /**
     * Разменные монеты
     */
    private final int[] coins = {10, 5, 2, 1};

    /**
     * Вернуть сдачу монетами
     * @param money - вносимая сумма в аппарат
     * @param price - цена товара в аппарате
     * @return - массив возвращаемых монет
     */
    public int[] change(int money, int price) {
        int[] rsl = new int[100];
        int size = 0;
        int coinIndex = 0;
        int rest = money - price;
        while (rest > 0) {
            if (rest >= coins[coinIndex]) {
                rsl[size++] = coins[coinIndex];
                rest -= coins[coinIndex];
            } else {
                coinIndex++;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}
