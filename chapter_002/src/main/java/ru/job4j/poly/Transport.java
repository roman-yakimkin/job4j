package ru.job4j.poly;

/**
 * Интерфейс - транспорт
 * @author Roman Yakimkin (r.yakimkin@yandex.ru)
 * @since 20.01.2020
 * @version 1.0
 */
public interface Transport {
    public void go();
    public void passengers(int count);
    public int fillUp(int quantity);
}
