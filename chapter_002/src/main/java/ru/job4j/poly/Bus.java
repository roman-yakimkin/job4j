package ru.job4j.poly;

/**
 * Класс - автобус
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 30.01.2020
 * @version 1.0
 */
public class Bus implements Transport {
    /**
     * Ехать
     */
    @Override
    public void go() {
        System.out.println("The bus is going");
    }

    /**
     *  Взять на борт пассажиров
     * @param count - количество пассажиров
     */
    @Override
    public void passengers(int count) {
        System.out.println("The bus has taken " + count + "passengers");
    }

    /**
     *  Заправить автобус и рассчитать стоимость
     * @param quantity - количество топлива в литрах
     * @return - возвращает стоимость в копейках
     */
    @Override
    public int fillUp(int quantity) {
        int priceOfLiter = 5000;
        return priceOfLiter * quantity;
    }
}
